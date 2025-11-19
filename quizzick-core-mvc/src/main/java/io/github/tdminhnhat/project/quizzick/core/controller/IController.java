package io.github.tdminhnhat.project.quizzick.core.controller;

import io.github.tdminhnhat.project.quizzick.core.exception.ApiNotSupportException;
import io.github.tdminhnhat.project.quizzick.core.model.vo.BaseVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

public interface IController<S extends Record, P extends Number> {

    ResponseEntity<? extends BaseVO> add(S request) throws Exception;

    ResponseEntity<? extends BaseVO> update(P id, S request) throws Exception;

    ResponseEntity<? extends BaseVO> delete(P id) throws Exception;

    ResponseEntity<? extends BaseVO> getById(P id) throws Exception;

    <Object extends BaseVO> ResponseEntity<Collection<Object>> getAll() throws Exception;

    default ResponseEntity<? extends BaseVO> uploadImage(P id, MultipartFile file) throws Exception {
        throw new ApiNotSupportException("This api is not supported");
    }

    default ResponseEntity<? extends BaseVO> deleteImage(P id) throws Exception {
        throw new ApiNotSupportException("This api is not supported");
    }

    default ResponseEntity<? extends BaseVO> getImage(P id) throws Exception {
        throw new ApiNotSupportException("This api is not supported");
    }
}
