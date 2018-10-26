package com.epam;

import com.epam.restclient.RESTClient;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestClientTest {
    private static final Logger LOG = Logger.getLogger(RestClientTest.class);
    private String restBaseUrl;
    RESTClient restClient;
    private String ADD_PATH;
    private String SUB_PATH;
    private String DIVIDE_PATH;
    private String MULT_PATH;
    private String PERCENT_PATH;

    @BeforeTest
    public void setUp() {
        restBaseUrl = "http://localhost:8080/epam/services";
        restClient = new RESTClient();
        ADD_PATH = "calc/add";
        SUB_PATH = "calc/subtract";
        DIVIDE_PATH = "calc/dividing";
        MULT_PATH = "calc/multiply";
        PERCENT_PATH = "calc/percent";
    }

    @Test
    public void restSubTest() {
        double firstNumber = 3;
        double secondNumber = 1;
        String expectedResult = "2,0000";
        String result = restClient.getSendResponseAndResult(restBaseUrl, SUB_PATH, firstNumber, secondNumber);
        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restAddTest() {
        double firstNumber = 2;
        double secondNumber = 1;
        String expectedResult = "3,0000";
        String result = restClient.getSendResponseAndResult(restBaseUrl, ADD_PATH, firstNumber, secondNumber);
        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restDivideTest() {
        double firstNumber = 8;
        double secondNumber = 2;
        String expectedResult = "4,0000";
        String result = restClient.getSendResponseAndResult(restBaseUrl, DIVIDE_PATH, firstNumber, secondNumber);
        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restMultiplyTest() {
        double firstNumber = 5;
        double secondNumber = 2;
        String expectedResult = "10,0000";
        String result = restClient.getSendResponseAndResult(restBaseUrl, MULT_PATH, firstNumber, secondNumber);
        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restPercentTest() {
        double firstNumber = 13;
        double secondNumber = 5;
        String expectedResult = "3,0000";
        String result = restClient.getSendResponseAndResult(restBaseUrl, PERCENT_PATH, firstNumber, secondNumber);
        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }
}
