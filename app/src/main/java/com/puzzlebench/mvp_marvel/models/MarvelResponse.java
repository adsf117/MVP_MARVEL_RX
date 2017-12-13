package com.puzzlebench.mvp_marvel.models;

/**
 * Created by andresdavid on 21/02/17.
 */

public class MarvelResponse <T> {

    private int code;
    private String status;
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
