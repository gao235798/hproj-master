package com.espread.common.utils;

public enum AppHttpCodeEnum {
    // 成功
    SUCCESS(0,"操作成功"),
    // 报错
    SYSTEM_ERROR(500,"出现错误"),
    // 接口最大编码报错
    SYSTEM_MAXCODE_ERROR(501,"未找到接口最大编码");

    int code;
    String msg;

    AppHttpCodeEnum(int code, String errorMessage){
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
