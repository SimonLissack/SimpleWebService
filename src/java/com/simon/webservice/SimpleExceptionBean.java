/**
 * @author Simon Lissack
 * SimpleExceptionBean.java
 * Contains the message for SimpleException
 */

package com.simon.webservice;

public class SimpleExceptionBean {
    private String message;
 
    public SimpleExceptionBean() {
    }
    public SimpleExceptionBean(String message) {
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
 
}