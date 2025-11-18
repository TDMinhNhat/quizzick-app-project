package io.github.tdminhnhat.project.quizzick.core.service;

import org.springframework.web.multipart.MultipartFile;

public interface IImageService<P extends Number> {

    Object uploadImage(P id, MultipartFile file);

    Object deleteImage(P id);

    Object getImage(P id);
}
