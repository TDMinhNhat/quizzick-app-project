package io.github.tdminhnhat.project.quizzick.reactor.core.exception;

public class ApiNotSupportException extends RuntimeException {
    public ApiNotSupportException() {
        super();
    }

    public ApiNotSupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiNotSupportException(Throwable cause) {
        super(cause);
    }

    protected ApiNotSupportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ApiNotSupportException(String message) {
        super(message);
    }
}
