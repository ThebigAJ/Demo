package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private final List<String> receivedDataList = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {return "Fuck dig bitch";}

    @PostMapping("/hello")
    public String receiveData(@RequestBody String data) {
        // Log the received data
        System.out.println("Data received: " + data);

        // Store the received data
        receivedDataList.add(data);

        // Return a confirmation message
        return "Data received: " + data;
    }

    @GetMapping("/data")
    public List<String> getData() {
        return receivedDataList;
    }
}
