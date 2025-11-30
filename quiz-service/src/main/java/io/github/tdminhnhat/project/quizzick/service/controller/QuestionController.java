package io.github.tdminhnhat.project.quizzick.service.controller;

import io.github.tdminhnhat.project.quizzick.reactor.core.controller.IController;
import io.github.tdminhnhat.project.quizzick.service.model.dto.QuestionDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.QuestionVo;
import io.github.tdminhnhat.project.quizzick.service.service.QuestionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/${api-path.question-controller}")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class QuestionController implements IController<QuestionDto, Long> {
 
    QuestionService questionService;

    @Override
    public Mono<QuestionVo> add(QuestionDto request) throws Exception {
        return null;
    }

    @Override
    public Mono<QuestionVo> update(Long id, QuestionDto request) throws Exception {
        return null;
    }

    @Override
    public Mono<QuestionVo> delete(Long id) throws Exception {
        return null;
    }

    @Override
    public Mono<QuestionVo> getById(Long id) throws Exception {
        return null;
    }

    @Override
    public Flux<QuestionVo> getAll() throws Exception {
        return null;
    }

    @Override
    public Mono<QuestionVo> uploadImage(Long id, MultipartFile file) throws Exception {
        return null;
    }

    @Override
    public Mono<QuestionVo> deleteImage(Long id) throws Exception {
        return null;
    }
}
