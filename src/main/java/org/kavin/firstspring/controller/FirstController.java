package org.kavin.firstspring.controller;

import org.json.simple.JSONObject;
import org.kavin.firstspring.model.HelloResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public HelloResponse fun() {
        return new HelloResponse("Hello World!");
    }

    @PostMapping("/hello")
    public HelloResponse hello(@RequestBody String name) {
        return new  HelloResponse("Hello " + name +"!");
    }
}
