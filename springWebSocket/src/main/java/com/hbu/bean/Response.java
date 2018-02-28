package com.hbu.bean;

/**
 * Created by chenwei on 2018/1/29.
 */
public class Response {

    private String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Response(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
