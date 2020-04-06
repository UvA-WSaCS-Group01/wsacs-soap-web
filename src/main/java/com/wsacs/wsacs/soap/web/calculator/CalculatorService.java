package com.wsacs.wsacs.soap.web.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CalculatorService")
public class CalculatorService {

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
