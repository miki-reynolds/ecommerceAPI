package com.kaisha.ecomapi.exceptions;


/**
 * An enumeration of error codes and associated i18n message keys for order
 * related validation errors.
 **/
public enum ErrorCode {
    // Internal Errors: 1 to 0999
    GENERIC_ERROR("KAISHA-0001", "The system is unable to complete the request. Contact system support."),
    HTTP_MEDIATYPE_NOT_SUPPORTED("KAISHA-0002", "Requested media type is not supported. " +
            "Please use application/json or application/xml as 'Content-Type' header value"),
    HTTP_MESSAGE_NOT_WRITABLE("KAISHA-0003", "Missing 'Accept' header. Please add 'Accept' header."),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("KAISHA-0004", "Requested 'Accept' header value is not supported. " +
            "Please use application/json or application/xml as 'Accept' value"),
    JSON_PARSE_ERROR("KAISHA-0005", "Make sure request payload should be a valid JSON object."),
    HTTP_MESSAGE_NOT_READABLE("KAISHA-0006", "Make sure request payload should be a valid JSON " +
            "or XML object according to 'Content-Type'.");

    private String errCode;
    private String errMsgKey;

    ErrorCode(final String errCode, final String errMsgKey) {
        this.errCode = errCode;
        this.errMsgKey = errMsgKey;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsgKey() {
        return this.errMsgKey;
    }

}