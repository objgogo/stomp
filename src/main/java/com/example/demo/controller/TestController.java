package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> home(
            @RequestParam(value = "text") String text) {
        return new ResponseEntity<>(testService.test(text), HttpStatus.OK);
    }
}
