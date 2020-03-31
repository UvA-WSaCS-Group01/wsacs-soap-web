/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsacs.wsacs.soap.web.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mail
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        return x+y;
    }
    
    @WebMethod(operationName = "min")
    public int min(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        return x-y;
    }
    
    @WebMethod(operationName = "mul")
    public int mul(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        return x*y;
    }
    
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        return x/y;
    }
    
}
