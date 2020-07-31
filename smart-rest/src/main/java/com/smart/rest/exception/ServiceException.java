package com.smart.rest.exception;

import com.smart.rest.common.RespCode;
import lombok.*;
// spring boot  参数校验错误统一处理
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends RuntimeException {
    private String msg;
    private int status;

    public ServiceException(RespCode respCode) {
        super(respCode.getMsg());
        this.status = respCode.getStatus();
    }
}
