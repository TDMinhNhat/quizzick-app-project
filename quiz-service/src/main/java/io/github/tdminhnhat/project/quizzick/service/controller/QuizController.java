package io.github.tdminhnhat.project.quizzick.service.controller;

import io.github.tdminhnhat.project.quizzick.reactor.core.controller.IController;
import io.github.tdminhnhat.project.quizzick.service.model.dto.QuizDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.QuizVo;
import io.github.tdminhnhat.project.quizzick.service.service.QuizService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/${api-path.quiz-controller}")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class QuizController implements IController<QuizDto, Long> {

    QuizService quizService;

    @PostMapping
    @Override
    public Mono<QuizVo> add(@Valid @RequestBody QuizDto request) throws Exception {
        return quizService.add(request);
    }

    @PutMapping("/{id}")
    @Override
    public Mono<QuizVo> update(@PathVariable("id") Long id, @Valid @RequestBody QuizDto request) throws Exception {
        return quizService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @Override
    public Mono<QuizVo> delete(@PathVariable("id") Long id) throws Exception {
        return quizService.delete(id);
    }

    @GetMapping("/{id}")
    @Override
    public Mono<QuizVo> getById(@PathVariable("id") Long id) throws Exception {
        return quizService.getById(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_NDJSON_VALUE)
    @Override
    public Flux<QuizVo> getAll() throws Exception {
        return quizService.getAll();
    }

    @PostMapping("/{id}/avatar")
    @Override
    public Mono<QuizVo> uploadImage(@PathVariable("id") Long id, @RequestPart(name = "avatar") MultipartFile file) throws Exception {
        return quizService.uploadImage(id, file);
    }

    @DeleteMapping("/{id}/avatar")
    @Override
    public Mono<QuizVo> deleteImage(@PathVariable("id") Long id) throws Exception {
        return quizService.deleteImage(id);
    }
}
