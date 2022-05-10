package com.kalinin.springboot.mybatis.exception;

public class NoSuchGuideException extends RuntimeException {
    public NoSuchGuideException(String message) {
        super(message);
    }
}
