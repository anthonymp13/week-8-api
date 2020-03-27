package com.yelpapi.perstistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yelpapi.entity.PostalCodesItem;
import com.yelpapi.entity.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class GeoNamesAPI {
    private final Logger logger = LogManager.getLogger(this.getClass());

     public Response getResponse(int postalCode) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://api.geonames.org/postalCodeLookupJSON?postalcode="+ postalCode + "&username=apoleski");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Response postalcodes = null;

        try {
            postalcodes = mapper.readValue(response, Response.class);
        } catch (JsonProcessingException e) {
            logger.error("Exception: " + e);
            e.printStackTrace();
        }

        return postalcodes;
    }



}
