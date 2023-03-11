package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;


public class Parserrr {
    public static void parseJson(String path)  {
        ObjectMapper objectMapper = new ObjectMapper();
        Forjson forjson= null;
        try {
            forjson = objectMapper.readValue(new File(path), Forjson.class);
        }catch (Exception e){
            System.out.println("ERROR"+e);
        }
        System.out.println(forjson);
    }
}
