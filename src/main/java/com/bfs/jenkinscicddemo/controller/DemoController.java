package com.bfs.jenkinscicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DemoController {

    @GetMapping({"/", "/demo"})
    public String demo() {
        return "Demo works!";
    }

    @GetMapping("/demo/{msg}")
    public String demoMessage(@PathVariable String msg) {
        return "Demo message: " + msg;
    }
}
