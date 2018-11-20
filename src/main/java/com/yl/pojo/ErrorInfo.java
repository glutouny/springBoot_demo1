package com.yl.pojo;

/**
 * @author 杨黎
 * @Title   ErrorInfo
 * @description 错误信息
 * @DATE 2018/11/8  18:41
 */
public class ErrorInfo<T> {

    private static final Integer OK = 0;
    private static final Integer EOORO = 1000;

    private Integer code;

    private String message;

    private String url;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
