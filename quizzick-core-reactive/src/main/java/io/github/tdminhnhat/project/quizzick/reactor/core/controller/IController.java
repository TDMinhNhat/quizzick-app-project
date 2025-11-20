package io.github.tdminhnhat.project.quizzick.reactor.core.controller;

import io.github.tdminhnhat.project.quizzick.reactor.core.exception.ApiNotSupportException;
import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IController<S extends Record, P extends Number> {

    Mono<? extends BaseVo> add(S request) throws Exception;

    Mono<? extends BaseVo> update(P id, S request) throws Exception;

    Mono<? extends BaseVo> delete(P id) throws Exception;

    Mono<? extends BaseVo> getById(P id) throws Exception;

    Flux<? extends BaseVo> getAll() throws Exception;

    default Mono<? extends BaseVo> uploadImage(P id, MultipartFile file) throws Exception {
        return Mono.error(new ApiNotSupportException("Upload image is not supported"));
    }

    default Mono<? extends BaseVo> deleteImage(P id) throws Exception {
        return Mono.error(new ApiNotSupportException("Delete image is not supported"));
    }

    default Mono<? extends BaseVo> getImage(P id) throws Exception {
        return Mono.error(new ApiNotSupportException("Get image is not supported"));
    }
}
