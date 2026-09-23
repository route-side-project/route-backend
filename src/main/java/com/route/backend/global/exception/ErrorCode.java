package com.route.backend.global.exception;

import org.springframework.http.HttpStatus;

public interface ErrorCode {

    HttpStatus getStatus();

    String getMessage();

    String name();
}
