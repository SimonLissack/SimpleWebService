/**
 * @author Simon Lissack
 * SimpleException.java
 * Exception wrapper to contain the Exception thrown by the web service.
 */

package com.simon.webservice;

import javax.xml.ws.WebFault;
 
@WebFault(name="SimpleException")
public class SimpleException extends Exception{
    private SimpleExceptionBean faultBean;
 
    public SimpleException(String message, SimpleExceptionBean faultInfo){
        super(message);
        faultBean = faultInfo;
    }
 
    public SimpleException(String message, SimpleExceptionBean faultInfo, Throwable cause) {
        super(message, cause);
        faultBean = faultInfo;
    }
 
    public SimpleExceptionBean getFaultInfo(){
        return faultBean;
    }
}