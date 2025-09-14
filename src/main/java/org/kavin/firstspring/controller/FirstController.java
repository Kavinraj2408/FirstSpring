package org.kavin.firstspring.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String fun() {
        return "Hello World!";
    }

    @PostMapping("/hello")
    public String hello(@RequestBody JSONObject name) {
        return "Hello " + name.get("name") + "!";
    }
}
