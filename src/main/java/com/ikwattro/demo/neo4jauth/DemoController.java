package com.ikwattro.demo.neo4jauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        return "Hello, you're authenticated as " + principal.getName();
    }
}
