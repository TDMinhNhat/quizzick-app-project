package io.github.tdminhnhat.project.quizzick.service.service;

import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import io.github.tdminhnhat.project.quizzick.reactor.core.service.IImageService;
import io.github.tdminhnhat.project.quizzick.reactor.core.service.IService;
import io.github.tdminhnhat.project.quizzick.service.model.dto.QuestionDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.QuestionVo;
import io.github.tdminhnhat.project.quizzick.service.repository.QuestionRepository;
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
public class QuestionService implements IService<QuestionDto, Long>, IImageService<Long> {
    
    QuizRepository quizRepository;
    QuestionRepository questionRepository;

    @Override
    public Mono<QuestionVo> uploadImage(Long id, MultipartFile file) {
        return null;
    }

    @Override
    public Mono<QuestionVo> deleteImage(Long id) {
        return null;
    }

    @Override
    public Mono<QuestionVo> add(QuestionDto request) {
        return null;
    }

    @Override
    public Mono<QuestionVo> update(Long id, QuestionDto request) {
        return null;
    }

    @Override
    public Mono<QuestionVo> delete(Long id) {
        return null;
    }

    @Override
    public Mono<QuestionVo> getById(Long id) {
        return null;
    }

    @Override
    public Flux<QuestionVo> getAll() {
        return null;
    }
}
