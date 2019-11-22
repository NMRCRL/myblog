package com.zl.blog.util;

import lombok.Data;



@Data
public class ResponseObject {
    private Integer code;
    private String msg;
    private Object data;

    /**
     * 构造方法私有，禁止外部类创建该类对象
     */
    private ResponseObject() {

    }

    /**
     * 静态方法，对外提供该类的对象，请求成功无数据返回
     * @param code
     * @param msg
     * @return
     */
    public static ResponseObject success(Integer code, String msg) {
        ResponseObject ro = new ResponseObject();
        ro.setCode(code);
        ro.setMsg(msg);
        return ro;
    }

    /**
     * 静态方法，对外提供该类的对象，请求成功有数据返回
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static ResponseObject success(Integer code, String msg, Object data) {
        ResponseObject ro = new ResponseObject();
        ro.setCode(code);
        ro.setMsg(msg);
        ro.setData(data);
        return ro;
    }

    /**
     *静态方法，对外提供该类的对象，请求失败
     * @param code
     * @param msg
     * @return
     */
    public static ResponseObject error(Integer code, String msg) {
        ResponseObject ro = new ResponseObject();
        ro.setCode(code);
        ro.setMsg(msg);
        return ro;
    }
}