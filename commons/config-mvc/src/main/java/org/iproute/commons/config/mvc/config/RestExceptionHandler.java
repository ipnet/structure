package org.iproute.commons.config.mvc.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * RestExceptionHandler
 *
 * @author winterfell
 * @since 2021/11/8
 */
@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {

    /**
     * No handler Exception Handler.
     *
     * @param e the e
     * @return the string
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public String noHandler(NoHandlerFoundException e) {
        log.error(StringUtils.EMPTY, e);
        return e.getMessage();
    }

}
