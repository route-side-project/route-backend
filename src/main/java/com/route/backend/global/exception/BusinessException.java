package com.route.backend.global.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode, Object... args) {
        super(args.length == 0 ? errorCode.getMessage() : String.format(errorCode.getMessage(), args));
        this.errorCode = errorCode;
    }
}
