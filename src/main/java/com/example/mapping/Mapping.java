package com.example.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Mapping {
    private static HashMap<String, ArrayList<HashMap<String, Object>>> result = null;

    static {
        if (result == null) {
            try {
                result = new ObjectMapper().readValue(Mapping.class.getResourceAsStream("/mapping.json"), HashMap.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getMapping(String url, String name) {
        for (HashMap<String, Object> page : Mapping.result.get("pages")) {
            if (page.get("url").equals(url)) {
                for (Object mappings : (ArrayList) page.get("mappings")) {
                    if (((LinkedHashMap) mappings).containsKey(name)) {
                        return ((LinkedHashMap) mappings).get(name).toString();
                    }
                }
            }
        }
        return null;
    }

}