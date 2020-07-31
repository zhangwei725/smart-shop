package com.smart.rest.common;

public enum RespCode {
    ERROR_MEMBER_NO_EXSIT(400010, "账号不存在"),
    ERROR_MEMBER_PASSWORD(400011, "账号或者密码错误");
    private int status;
    private String msg;

    RespCode(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
