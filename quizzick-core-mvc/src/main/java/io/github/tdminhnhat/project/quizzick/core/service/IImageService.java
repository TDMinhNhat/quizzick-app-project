package io.github.tdminhnhat.project.quizzick.core.service;

import org.springframework.web.multipart.MultipartFile;

public interface IImageService<P extends Number> {

    Object uploadImage(P id, MultipartFile file) throws Exception;

    Object deleteImage(P id) throws Exception;

    Object getImage(P id) throws Exception;
}
