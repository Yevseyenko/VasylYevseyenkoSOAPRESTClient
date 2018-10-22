
package com.epam;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorSOAPService", targetNamespace = "http://SOAPService.services.epam.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculatorSOAPService {


    /**
     * 
     * @param secondNumber
     * @param firstNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Subtract")
    @WebResult(partName = "return")
    public String subtract(
        @WebParam(name = "firstNumber", partName = "firstNumber")
        double firstNumber,
        @WebParam(name = "secondNumber", partName = "secondNumber")
        double secondNumber);

    /**
     * 
     * @param secondNumber
     * @param firstNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Adding")
    @WebResult(partName = "return")
    public String adding(
        @WebParam(name = "firstNumber", partName = "firstNumber")
        double firstNumber,
        @WebParam(name = "secondNumber", partName = "secondNumber")
        double secondNumber);

    /**
     * 
     * @param secondNumber
     * @param firstNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Percent")
    @WebResult(partName = "return")
    public String percent(
        @WebParam(name = "firstNumber", partName = "firstNumber")
        double firstNumber,
        @WebParam(name = "secondNumber", partName = "secondNumber")
        double secondNumber);

    /**
     * 
     * @param secondNumber
     * @param firstNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Multiplying")
    @WebResult(partName = "return")
    public String multiplying(
        @WebParam(name = "firstNumber", partName = "firstNumber")
        double firstNumber,
        @WebParam(name = "secondNumber", partName = "secondNumber")
        double secondNumber);

    /**
     * 
     * @param secondNumber
     * @param firstNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Dividing")
    @WebResult(partName = "return")
    public String dividing(
        @WebParam(name = "firstNumber", partName = "firstNumber")
        double firstNumber,
        @WebParam(name = "secondNumber", partName = "secondNumber")
        double secondNumber);

}
