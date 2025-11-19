package io.github.tdminhnhat.project.quizzick.core.service;

import java.util.Collection;

public interface IService<S extends Record, P extends Number> {

    void initService() throws Exception;

    void destroyService() throws Exception;

    Object add(S request) throws Exception;

    Object update(P id, S request) throws Exception;

    Object delete(P id) throws Exception;

    Object getById(P id) throws Exception;

    Collection<?> getAll() throws Exception;
}
