package com.template.setup.resource.builder;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ResponseBuilder<T> {
    private int status;
    private T data;
    private String message;

    private ResponseBuilder() {
    }

    public static <T> ResponseBuilder<T> getInstance() {
        return new ResponseBuilder<T>();
    }

    public ResponseBuilder<T> status(int status) {
        this.status = status;
        return this;
    }

    public ResponseBuilder<T> data(T data) {
        this.data = data;
        return this;
    }

    public ResponseBuilder<T> message(String message) {
        this.message = message;
        return this;
    }
}
