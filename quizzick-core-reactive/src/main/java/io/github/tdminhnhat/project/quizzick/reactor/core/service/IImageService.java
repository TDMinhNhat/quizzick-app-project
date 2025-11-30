package io.github.tdminhnhat.project.quizzick.reactor.core.service;

import io.github.tdminhnhat.project.quizzick.reactor.core.exception.ServiceNotImplementException;
import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

public interface IImageService<P extends Number>{

    Mono<? extends BaseVo> uploadImage(P id, MultipartFile file);

    Mono<? extends BaseVo> deleteImage(P id);

    default Mono<? extends BaseVo> getImage(P id) {
        return Mono.error(new ServiceNotImplementException("This service does not implement or allow running this method"));
    }
}
