package com.epam;

import com.epam.restclient.RESTClient;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestClientTest {
    private static final Logger LOG = Logger.getLogger(RestClientTest.class);
    private String restBaseUrl;
    RESTClient restClient;

    @BeforeTest
    public void setUp() {
        restBaseUrl = "http://localhost:8080/epam/services/calc";
        restClient = new RESTClient();
    }

    @Test
    public void restAddTest() {
        double firstNumber = 1;
        double secondNumber = 2;
        double expectedResult = 3.0000;
        double result = restClient.sendAndGetResult(restBaseUrl + "/add/" + firstNumber + "/" + secondNumber);

        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restSubtractTest() {
        double firstNumber = 5;
        double secondNumber = 1;
        double expectedResult = 4.0000;
        double result = restClient.sendAndGetResult(restBaseUrl + "/subtract/" + firstNumber + "/" + secondNumber);

        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restDivideTest() {
        double firstNumber = 6;
        double secondNumber = 3;
        double expectedResult = 2.0000;
        double result = restClient.sendAndGetResult(restBaseUrl + "/divide/" + firstNumber + "/" + secondNumber);

        LOG.info("Expected = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restMultiplyTest() {
        double firstNumber = 5;
        double secondNumber = 2;
        double expected = 10.0000;
        double result = restClient.sendAndGetResult(restBaseUrl + "/multiply/" + firstNumber + "/" + secondNumber);

        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void restPercentTest() {
        double firstN = 13;
        double secondN = 5;
        double expected = 3.0000;
        double result = restClient.sendAndGetResult(restBaseUrl + "/percent/" + firstN + "/" + secondN);

        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }
}
