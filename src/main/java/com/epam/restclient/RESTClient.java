package com.epam.restclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.apache.log4j.Logger;

import javax.ws.rs.core.MediaType;

public class RESTClient {
    private static final Logger log = Logger.getLogger(RESTClient.class);

    public String getSendResponseAndResult(String URI, String Path, double firstNumber, double secondNumber) {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource service = client.resource(URI);
        log.info("Cant return response");
        return getOutputAsText(service.path(Path).path(firstNumber + "/" + secondNumber));
    }

    private static String getOutputAsText(WebResource service) {
        return service.accept(MediaType.TEXT_PLAIN).get(String.class);
    }
}
