package io.github.tdminhnhat.project.quizzick.reactor.core.exception;

public class ServiceNotImplementException extends RuntimeException {
    public ServiceNotImplementException() {
        super();
    }

    public ServiceNotImplementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceNotImplementException(Throwable cause) {
        super(cause);
    }

    protected ServiceNotImplementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ServiceNotImplementException(String message) {
        super(message);
    }
}
