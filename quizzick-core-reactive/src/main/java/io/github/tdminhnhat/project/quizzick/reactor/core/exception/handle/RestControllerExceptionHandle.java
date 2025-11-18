package io.github.tdminhnhat.project.quizzick.reactor.core.exception.handle;

import io.github.tdminhnhat.project.quizzick.reactor.core.entity.HttpResponseResult;
import io.github.tdminhnhat.project.quizzick.reactor.core.exception.ApiNotSupportException;
import io.github.tdminhnhat.project.quizzick.reactor.core.exception.QueryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

import java.net.http.HttpResponse;

@RestControllerAdvice
public class RestControllerExceptionHandle {

    @ExceptionHandler(QueryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Mono<? extends HttpResponse> handleQueryNotFoundException(QueryNotFoundException e) {
        return Mono.just(new HttpResponseResult(HttpStatus.NOT_FOUND, e.getMessage()));
    }

    @ExceptionHandler(ApiNotSupportException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Mono<? extends HttpResponse> handleApiNotSupportException(ApiNotSupportException e) {
        return Mono.just(new HttpResponseResult(HttpStatus.BAD_REQUEST, e.getMessage()));
    }
}
