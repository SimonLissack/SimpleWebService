/**
 * @author Simon Lissack
 * SimpleWebService.java
 * 
 * An endpoint for a SOAP based Web Service.
 * 
 */
package com.simon.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

// The url will now be ../HelloService
@WebService(serviceName="HelloService") 
public class SimpleWebService {
    // The method element in the XML will now be SayHello
    @WebMethod(operationName="SayHello") 
    // @WebParam will rename the input from arg0 to name
    public String sayHello(@WebParam(name="name") String name) throws SimpleException{
        if(name.equalsIgnoreCase("fault")){
            throw new SimpleException("Fault Detected", new SimpleExceptionBean());
        }
        return "Hello " + name + "!";
    }
}
