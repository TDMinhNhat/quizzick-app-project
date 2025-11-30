package io.github.tdminhnhat.project.quizzick.service.mapper;

import io.github.tdminhnhat.project.quizzick.service.entity.User;
import io.github.tdminhnhat.project.quizzick.service.model.dto.UserDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto request);

    UserVo toVo(User user);
}
