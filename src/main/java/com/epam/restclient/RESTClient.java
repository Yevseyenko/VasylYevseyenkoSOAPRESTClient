package com.epam.restclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.apache.log4j.Logger;

import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class RESTClient {
    private static final Logger log = Logger.getLogger(RESTClient.class);
    Number number = null;
    static NumberFormat formatter = new DecimalFormat("#0.0000");

    public double sendAndGetResult(String requestUrl) {
        URL url = null;
        try {
            url = new URL(requestUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpURLConnection request = null;
        try {
            request = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            request.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JsonParser jsonParser = new JsonParser();
        JsonElement root = null;

        try {
            root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JsonObject rootobj = root.getAsJsonObject();

        try {
            number = formatter.parse(rootobj.get("result").getAsString());
        } catch (ParseException e) {
            log.error(e);
        }

        return number.doubleValue();
    }
}
