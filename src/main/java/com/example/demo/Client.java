package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



public class Client {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String serverHostname = "DESKTOP-VQN4Q8R";
        String url = "https://" + serverHostname + ":8080/hello";
        String data = "Hello, Spring Boot!";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<String> request = new HttpEntity<>(data, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        System.out.println("Response from server: " + response.getBody());
    }
}