package io.github.tdminhnhat.project.quizzick.core.service;

import java.util.Collection;

public interface IService<S extends Record, P extends Number> {

    Object add(S request);

    Object update(P id, S request);

    Object delete(P id);

    Object getById(P id);

    Collection<?> getAll();
}
