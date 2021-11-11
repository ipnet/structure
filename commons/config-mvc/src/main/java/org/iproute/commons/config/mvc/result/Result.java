package org.iproute.commons.config.mvc.result;

/**
 * Result
 *
 * @author winterfell
 * @since 2021/11/9
 */
public class Result<T> {

    private int code;

    private String msg;

    private T data;
}
