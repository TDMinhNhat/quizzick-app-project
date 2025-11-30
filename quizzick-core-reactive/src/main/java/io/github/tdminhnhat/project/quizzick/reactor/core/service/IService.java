package io.github.tdminhnhat.project.quizzick.reactor.core.service;

import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IService<S extends Record, P extends Number> {

    Mono<? extends BaseVo> add(S request);

    Mono<? extends BaseVo> update(P id, S request);

    Mono<? extends BaseVo> delete(P id);

    Mono<? extends BaseVo> getById(P id);

    Flux<? extends BaseVo> getAll();
}
