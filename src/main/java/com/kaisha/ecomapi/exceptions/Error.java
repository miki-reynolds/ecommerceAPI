package com.kaisha.ecomapi.exceptions;


/**
 * Error
 * <p>
 * Complex type that contains error details for a REST API calls.
 **/

public class Error {

    private static final long serialVersionUID = 1L;

    private String errorCode; //application error code, which is different from HTTP error code.

    private String message;  //short, human-readable summary of the problem.

    private Integer status; //HTTP status code for this occurrence of the problem, set by the origin server.

    private String url = "Not available"; //url of request that produced the error.

    private String reqMethod = "Not available"; //method of request that produced the error.

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return this.url;
    }

    public Error setUrl(String url) {
        if (!url.isEmpty()) {
            this.url = url;
        }
        return this;
    }

    public String getReqMethod() {
        return this.reqMethod;
    }

    public Error setReqMethod(String method) {
        if (!method.isEmpty()) {
            this.reqMethod = method;
        }
        return this;
    }
}