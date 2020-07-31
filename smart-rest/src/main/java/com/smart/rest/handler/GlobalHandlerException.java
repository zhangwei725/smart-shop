package com.smart.rest.handler;

import com.smart.rest.common.RespEntity;
import com.smart.rest.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 */
@RestControllerAdvice
@Slf4j
public class GlobalHandlerException {
    @ExceptionHandler(Exception.class)
    public RespEntity<Object> handler(Exception e) {
        if (e instanceof ServiceException) {
            log.error(e.getMessage());
        }
        return RespEntity.error();
    }
}
