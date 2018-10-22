package com.epam.soapclient;


import com.epam.CalculatorSOAPServiceService;

public class SOAPClient {
    public String add(double firstNumber, double secondNumber) {
        return new CalculatorSOAPServiceService().getCalculatorSOAPServicePort().adding(firstNumber, secondNumber);
    }

    public String sub(double firstNumber, double secondNumber) {
        return new CalculatorSOAPServiceService().getCalculatorSOAPServicePort().subtract(firstNumber, secondNumber);
    }

    public String percent(double firstNumber, double secondNumber) {
        return new CalculatorSOAPServiceService().getCalculatorSOAPServicePort().percent(firstNumber, secondNumber);
    }


    public String div(double firstNumber, double secondNumber) {
        return new CalculatorSOAPServiceService().getCalculatorSOAPServicePort().dividing(firstNumber, secondNumber);
    }

    public String mult(double firstNumber, double secondNumber) {
        return new CalculatorSOAPServiceService().getCalculatorSOAPServicePort().multiplying(firstNumber, secondNumber);
    }
}
