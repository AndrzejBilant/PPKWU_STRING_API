package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {

    @RequestMapping(path = "/analyseString")
    public String analyseString(@RequestParam(value = "stringToanalyse", required = false)String input){
        return "test";
    }

}
