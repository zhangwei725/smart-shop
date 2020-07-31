package com.smart.rest.exception;

import com.smart.rest.common.RespCode;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceException extends RuntimeException {
    private String msg;
    private int status;

    public ServiceException(RespCode respCode) {
        super(respCode.getMsg());
        this.status = respCode.getStatus();
    }
}
