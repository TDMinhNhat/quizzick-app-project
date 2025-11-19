package io.github.tdminhnhat.project.quizzick.core.controller;

import io.github.tdminhnhat.project.quizzick.core.model.vo.BaseVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface IController<S extends Record, P extends Number> {

    ResponseEntity<? extends BaseVO> add(S request);

    ResponseEntity<? extends BaseVO> update(P id, S request);

    ResponseEntity<? extends BaseVO> delete(P id);

    ResponseEntity<? extends BaseVO> getById(P id);

    ResponseEntity<? extends BaseVO> getAll();

    default ResponseEntity<? extends BaseVO> uploadImage(P id, MultipartFile file) {
        return null;
    }

    default ResponseEntity<? extends BaseVO> deleteImage(P id) {
        return null;
    }

    default ResponseEntity<? extends BaseVO> getImage(P id) {
        return null;
    }
}
