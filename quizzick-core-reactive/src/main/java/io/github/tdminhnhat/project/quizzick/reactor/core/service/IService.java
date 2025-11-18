package io.github.tdminhnhat.project.quizzick.reactor.core.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IService<S extends Record, P extends Number> {

    Mono<Object> add(S request);

    Mono<Object> update(P id, S request);

    Mono<Object> delete(P id);

    Mono<Object> getById(P id);

    Flux<Object> getAll();
}
