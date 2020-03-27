package persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yelpapi.entity.Response;
import com.yelpapi.entity.PostalCodesItem;
import com.yelpapi.perstistence.GeoNamesAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    public void testGeonamesJSON() throws Exception {
        GeoNamesAPI postalcode = new GeoNamesAPI();
        List<PostalCodesItem> code = postalcode.getResponse(53597).getPostalcodes();
        for (PostalCodesItem postalCode : code) {
            postalCode.getPostalCode();
        }

        assertEquals(1, code.size());

        assertEquals(1 , code.size());
    }
}