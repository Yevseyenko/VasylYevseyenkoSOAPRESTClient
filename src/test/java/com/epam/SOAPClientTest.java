package com.epam;

import com.epam.soapclient.SOAPClient;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class SOAPClientTest {
    private static final Logger LOG = Logger.getLogger(SOAPClientTest.class);

    SOAPClient soapClient = null;
    NumberFormat format = null;
    Number number = null;

    @BeforeTest
    public void setUp() {
        soapClient = new SOAPClient();
        format = new DecimalFormat("#0.0000");
        ;
        number = null;
    }

    @Test
    public void soapAddTest() {
        try {
            number = format.parse((soapClient.add(5, 5)));
        } catch (ParseException e) {
            LOG.error(e);
        }

        double result = number.doubleValue();
        double expected = 10.0000;
        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void soapSubtractTest() {
        try {
            number = format.parse((soapClient.sub(5, 3)));
        } catch (ParseException e) {
            LOG.error(e);
        }

        double result = number.doubleValue();
        double expected = 2.0;
        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void soapDivideTest() {
        try {
            number = format.parse((soapClient.div(8, 2)));
        } catch (ParseException e) {
            LOG.error(e);
        }

        double result = number.doubleValue();

        double expected = 4.0;
        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void soapMultiplyTest() {
        try {
            number = format.parse((soapClient.mult(4, 5)));
        } catch (ParseException e) {
            LOG.error(e);
        }

        double result = number.doubleValue();

        double expected = 20.0;
        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void soapPercentTest() {
        try {
            number = format.parse((soapClient.percent(5, 3)));
        } catch (ParseException e) {
            LOG.error(e);
        }

        double result = number.doubleValue();

        double expected = 2.0;
        LOG.info("Expected = " + expected + " and actual = " + result);
        Assert.assertEquals(expected, result);
    }
}
