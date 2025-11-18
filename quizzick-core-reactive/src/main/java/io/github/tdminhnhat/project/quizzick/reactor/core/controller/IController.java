package io.github.tdminhnhat.project.quizzick.reactor.core.controller;

import io.github.tdminhnhat.project.quizzick.reactor.core.exception.ApiNotSupportException;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IController<S extends Record, P extends Number> {

    Mono<Object> add(S request);

    Mono<Object> update(P id, S request);

    Mono<Object> delete(P id);

    Mono<Object> getById(P id);

    Flux<Object> getAll();

    default Mono<Object> uploadImage(P id, MultipartFile file) {
        return Mono.error(new ApiNotSupportException("Upload image is not supported"));
    }

    default Mono<Object> deleteImage(P id) {
        return Mono.error(new ApiNotSupportException("Delete image is not supported"));
    }

    default Mono<Object> getImage(P id) {
        return Mono.error(new ApiNotSupportException("Get image is not supported"));
    }
}
