package com.solanake.kalkulator.exception;

public class CountriesRuntimeException extends RuntimeException {

    public CountriesRuntimeException() {
    }

    public CountriesRuntimeException(String message) {
        super(message);
    }

    public CountriesRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CountriesRuntimeException(Throwable cause) {
        super(cause);
    }
}
