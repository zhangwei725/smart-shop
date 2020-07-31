package com.smart.rest.common;



import lombok.Data;

/**
 * 返回结果封装类
 */
@Data
public class RespEntity<T> {

    /**
     * 返回码
     */
    private int status;

    /**
     * 返回说明
     */
    private String msg;

    /**
     * 提示
     */
    private String tips;
    /**
     * 返回数据
     */
    private T data;
    private RespEntity(int status, String msg, String tips, T data) {
        this.status = status;
        this.msg = msg;
        this.tips = tips;
        this.data = data;
    }

    private RespEntity(RespCode respCode) {
        this(respCode,null);
    }
    private RespEntity(RespCode respCode, T data) {
        this(respCode.getStatus(),respCode.getMsg(),respCode.getTips(),data);
    }
    /**
     * @param data
     * @param <T>
     * @return
     */
    public static <T> RespEntity<T> success(T data) {
        return success(RespCode.SUCCESS, data);
    }

    public static <T> RespEntity<T> success(RespCode respCode, T data) {
        return new RespEntity<T>(respCode, data);
    }

    public static <T> RespEntity<T> error() {
        return new RespEntity<T>(RespCode.ERROR);
    }


    public static <T> RespEntity<T> error(RespCode respCode) {
        return error(respCode, null);
    }

    public static <T> RespEntity<T> error(RespCode codeEnum, T data) {
        return new RespEntity<T>(codeEnum, data);
    }
}
