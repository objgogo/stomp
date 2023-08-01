package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String test(String text){

        return text+"님 안녕하세요";
    }
}
