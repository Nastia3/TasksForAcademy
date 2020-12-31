package jsonUtill;

import Model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtill {
    public static Response toJava() {
        ObjectMapper mapper = new ObjectMapper();
        Response response = null;
        try {
            File json = new File("./TaskJson.json");
            response  = mapper.readValue(json, Response.class);
            System.out.println("Java object created from JSON");
        } catch (  IOException ex ) {
            ex.printStackTrace();
        }
        return  response;
    }
}

