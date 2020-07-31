package com.smart.rest.common;

public enum RespCode {
    /**
     * 返回成功
     */
    SUCCESS(200, "success", "成功"),
    ERROR(40000, "error", "错误"),
    // 用户相关
    UN_LOGIN(40001, "no login", "未登录"),
    UN_AUTH(40003, "no auth  account", "未授权"),

    /*用户未登录*/
    ACCOUNT_NOT_LOGIN(10001, "user no login", "用户未登录"),
    /*账号不存在或密码错误*/
    ACCOUNT_LOGIN_ERROR(10002, "user login error", "账号不存在或密码错误"),
    /*账号已存在*/
    ACCOUNT_IS_EXISTENT(10003, "account is existent", "账号已存在"),
    /*账号不存在*/
    ACCOUNT_NOT_EXIST(10004, "account not exist", "账号不存在!"),
    /*账号已禁止  请与管理员联系*/
    USER_ACCOUNT_LOCKED(10005, "user account locked", "账号被锁定, 请与管理员联系"),
    LOGIN_COUNT_LIMIT(10006, "account is existent", "登录失败多次，请稍后在试"),
    /* 参数错误*/
    /*参数不为空*/
    PARAMS_NOT_IS_BLANK(20001, "params not is blank", "参数不能为空"),
    /*参数无效*/
    PARAMS_IS_INVALID(20002, "params is invalid", "无效参数"),
    /*参数类型错误*/
    PARAM_TYPE_ERROR(20003, "param type error", "参数类型错误"),
    /*参数缺失*/
    PARAM_IS_DEFICIENCY(20004, "param is deficiency", "参数缺失"),
    /*暂无权限*/
    PERMISSION_NO_ACCESS(20006, "no permissions access", "暂无权限"),
    AUTH_ERROR(20007, "auth error", "认证失败"),
    /* 业务错误 */
    /* 业务繁忙 请稍后在试 */
    BUSINESS_UNKNOW_ERROR(30001, " busy with business", "业务繁忙 请稍后在试"),
    SYSTEM_ERROR(99999, "system  error", "接口错误"),
    /* ======系统错误：40001-49999===== */
    /* 提示语 "系统繁忙，请稍后重试"*/
    SYSTEM_INNER_ERROR(40001, "system error", "系统繁忙，请稍后重试"),
    /*未知错误 请稍后在试*/
    SYSTEM_UNKNOW_ERROR(40002, "system unknow error", "未知错误 请稍后在试"),
    /*内部系统接口调用异常*/
    INNER_INVOKE_ERROR(50001, "inner invoke error", "内部系统接口调用异常"),
    /*外部系统接口调用异常*/
    OUTER_INVOKE_ERROR(50002, "outer invoke error", "外部系统接口调用异常"),
    /*该接口禁止访问*/
    NO_ACCESS_FORBIDDEN(50003, "no access forbidden", "禁止访问"),
    /*接口地址无效*/
    NO_FOUND_ERROR(50004, "no found error", "接口地址无效"),
    /* 数据错误 */
    DATA_IS_WRONG(60001, "data is wrong", "数据错误");


    /**
     * 返回码
     */
    protected int status;
    /**
     * 返回说明
     */
    protected String msg;
    /**
     * 提示消息
     */
    protected String tips;

    RespCode(int retCode, String retMsg, String tips) {
        this.status = retCode;
        this.msg = retMsg;
        this.tips = tips;
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

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
