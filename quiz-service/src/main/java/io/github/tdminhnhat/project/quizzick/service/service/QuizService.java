package io.github.tdminhnhat.project.quizzick.service.service;

import io.github.tdminhnhat.project.quizzick.reactor.core.service.IImageService;
import io.github.tdminhnhat.project.quizzick.reactor.core.service.IService;
import io.github.tdminhnhat.project.quizzick.reactor.core.util.FileWorkingUtil;
import io.github.tdminhnhat.project.quizzick.service.mapper.QuizMapper;
import io.github.tdminhnhat.project.quizzick.service.model.dto.QuizDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.QuizVo;
import io.github.tdminhnhat.project.quizzick.service.repository.QuizRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class QuizService implements IService<QuizDto, Long>, IImageService<Long> {

    QuizRepository quizRepository;
    QuizMapper quizMapper;
    FileWorkingUtil fileWorkingUtil;

    @Override
    public Mono<QuizVo> uploadImage(Long id, MultipartFile file) {
        return null;
    }

    @Override
    public Mono<QuizVo> deleteImage(Long id) {
        return null;
    }

    @Override
    public Mono<QuizVo> add(QuizDto request) {
        return null;
    }

    @Override
    public Mono<QuizVo> update(Long id, QuizDto request) {
        return null;
    }

    @Override
    public Mono<QuizVo> delete(Long id) {
        return null;
    }

    @Override
    public Mono<QuizVo> getById(Long id) {
        return null;
    }

    @Override
    public Flux<QuizVo> getAll() {
        return null;
    }
}
