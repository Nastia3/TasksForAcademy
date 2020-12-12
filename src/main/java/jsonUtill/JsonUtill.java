package jsonUtill;

import Model.Response;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtill {
    public Response toJava() {
        ObjectMapper mapper = new ObjectMapper();
        Response response = null;
        try {

            File json = new File("./TaskJson.json");
            response  = mapper.readValue(json, Response.class);
            System.out.println("Java object created from JSON");
        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return  response;
    }
}

