package com.lightwell.hello;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        JSONObject json = new JSONObject();
        json.put("message", "Hello, World!");
        json.put("library", "org.json");
        json.put("version", "20220320");
        return json.toString();
    }
}
