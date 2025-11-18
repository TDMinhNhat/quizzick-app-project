package io.github.tdminhnhat.project.quizzick.reactor.core.service;

import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

public interface IImageService<P extends Number>{

    Mono<Object> uploadImage(P id, MultipartFile file);

    Mono<Object> deleteImage(P id);

    Mono<Object> getImage(P id);
}
