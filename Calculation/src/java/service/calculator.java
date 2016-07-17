/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "calculator")
public class calculator {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "sum")
    public int add(@WebParam(name="no1")int x, @WebParam(name="no2")int y)
    {
        return x+y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divide")
    public float divide(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a/b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "difference")
    public int difference(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a-b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "product")
    public int product(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a*b;
    }
    
    
}
