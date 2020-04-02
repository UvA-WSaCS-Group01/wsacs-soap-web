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
    public double add(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x+y;
    }
    
    @WebMethod(operationName = "sub")
    public double sub(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x-y;
    }
    
    @WebMethod(operationName = "mul")
    public double mul(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x*y;
    }
    
    @WebMethod(operationName = "div")
    public double div(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x/y;
    }
    
}
