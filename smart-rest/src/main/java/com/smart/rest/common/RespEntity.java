package com.smart.rest.common;

public class RespEntity<T> {

    protected String retCode;

    protected String retSubCode;

    protected String retMsg;

    protected String tips;

    protected String traceId;

    protected T info;

    public static <T> RespEntity<T> success(T data) {
        return null;
    }

    public static <T> RespEntity<T> error() {
        return null;
    }






}

