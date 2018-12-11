package com.evanslaton.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // Returns 'Hello World!'
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    // Capitalizes and returns the path variable 'string'
    @RequestMapping(value="/capitalize/{string}", method=RequestMethod.GET)
    public String capitalize(@PathVariable() String string) {
        return capitalizeString(string);
    }

    public static String capitalizeString(String string) {
        return string.toUpperCase();
    }
}
