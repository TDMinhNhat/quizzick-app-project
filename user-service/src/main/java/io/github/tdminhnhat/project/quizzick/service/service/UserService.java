package io.github.tdminhnhat.project.quizzick.service.service;

import io.github.tdminhnhat.project.quizzick.core.exception.QueryNotFoundException;
import io.github.tdminhnhat.project.quizzick.core.service.IImageService;
import io.github.tdminhnhat.project.quizzick.core.service.IService;
import io.github.tdminhnhat.project.quizzick.core.util.FileWorkingUtil;
import io.github.tdminhnhat.project.quizzick.service.entity.User;
import io.github.tdminhnhat.project.quizzick.service.mapper.UserMapper;
import io.github.tdminhnhat.project.quizzick.service.model.dto.UserDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.UserVo;
import io.github.tdminhnhat.project.quizzick.service.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserService implements IService<UserDto, Long>, IImageService<Long> {
    
    UserRepository userRepository;
    UserMapper userMapper;
    FileWorkingUtil fileWorkingUtil;
    EntityManager em;

    @Override
    @PostConstruct
    public void initService() throws Exception {

    }

    @Override
    @PreDestroy
    public void destroyService() throws Exception {
        em.flush();
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public UserVo uploadImage(Long id, MultipartFile file) throws Exception {
        User target = userRepository.findById(id).orElseThrow(() -> new QueryNotFoundException("This user wasn't found in database"));
        String objectName = "avatar/" + id + "_" + target.getFirstName() + "_" + target.getLastName();
        fileWorkingUtil.uploadFile(file, objectName);
        target.setAvatar(objectName);
        return getUserVo(userRepository.save(target));
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public UserVo deleteImage(Long id) throws Exception {
        User target = userRepository.findById(id).orElseThrow(() -> new QueryNotFoundException("This user wasn't found in database"));
        fileWorkingUtil.deleteFile(target.getAvatar());
        return getUserVo(target);
    }

    @Override
    public UserVo getImage(Long id) throws Exception {
        User target = userRepository.findById(id).orElseThrow(() -> new QueryNotFoundException("This user wasn't found in database"));
        return getUserVo(target);
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public UserVo add(UserDto request) throws Exception {
        return getUserVo(userRepository.save(userMapper.toEntity(request)));
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public UserVo update(Long id, UserDto request) throws Exception {
        User target = userRepository.findById(id).orElseThrow(() -> new QueryNotFoundException("This user wasn't found in database"));
        BeanUtils.copyProperties(userMapper.toEntity(request), target, "id");
        return getUserVo(userRepository.save(target));
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public UserVo delete(Long id) throws Exception {
        User target = userRepository.findById(id).orElseThrow(() -> new QueryNotFoundException("This user wasn't found in database"));
        target.setDeleted(false);
        return getUserVo(userRepository.save(target));
    }

    @Override
    public UserVo getById(Long id) throws Exception {
        return getUserVo(userRepository.findById(id).orElseThrow(() -> new QueryNotFoundException("This user wasn't found in database")));
    }

    @Override
    public Collection<UserVo> getAll() {
        return userRepository.findAll().stream().map(user -> {
            try {
                return getUserVo(user);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).toList();
    }

    private UserVo getUserVo(User user) throws Exception {
        UserVo userVo = userMapper.toVo(user);
        userVo.setAvatarUrl(user.getAvatar() != null ? fileWorkingUtil.getObject(user.getAvatar()) : null);
        return userVo;
    }
}
