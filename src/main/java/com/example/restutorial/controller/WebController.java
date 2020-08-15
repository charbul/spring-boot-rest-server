package com.example.restutorial.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping
    public ResponseEntity<String> giveWebResponse() {
        // use http://localhost:8080 in a browser or call "curl http://localhost:8080"
        return new ResponseEntity("Hello World", HttpStatus.ACCEPTED);
    }

}
