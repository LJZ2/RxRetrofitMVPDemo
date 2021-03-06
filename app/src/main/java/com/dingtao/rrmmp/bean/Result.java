package com.dingtao.rrmmp.bean;

import java.util.List;

/**
 * @author dingtao
 * @date 2018/12/28 10:05
 * qq:1940870847
 */
public class Result<T> {
    String status;
    String message;
    T result;
    String headPath;

    Object[] args;

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Object[] getArgs() {
        return args;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }
}
