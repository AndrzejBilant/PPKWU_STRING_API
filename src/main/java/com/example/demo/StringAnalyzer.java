package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController public class StringAnalyzer {

    @RequestMapping(path = "/analyseString")
    public String analyseString(@RequestParam(value = "stringToanalyse", required = false) String input) {

        String result = "In the input were:\n";

        char[] chars = input.toCharArray();

        int upperCase = 0, lowerCase = 0, numbers = 0, specialSings = 0;

        for (char c : chars) {

            if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            } else {
                specialSings++;
            }
        }

        if (numbers > 0) {
            result += numbers + " numbers";
        }
        if (lowerCase > 0) {
            result += lowerCase + " lowercase";
        }
        if (upperCase > 0) {
            result += upperCase + " uppercase";
        }
        if (specialSings > 0) {
            result += specialSings + " special sings";
        }

        return result;
    }

}
