package com.kenewstar.pojo;

/**
 * @Author: kenewstar
 * @Description: 响应信息
 * @Date:Created in 2020/5/29
 */
public class ResponseCode {

    private Integer code;   //响应码

    private Object msg;     //响应信息

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
    public ResponseCode(){}

    public ResponseCode(Integer code, Object msg) {
        this.code = code;
        this.msg = msg;
    }
}
