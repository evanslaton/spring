package com.evanslaton.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/capitalize/{string}")
    public String capitalizedString(@PathVariable() String string) {
        return string.toUpperCase();
    }
}
