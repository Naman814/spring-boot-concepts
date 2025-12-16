package com.springboot.demo.myapp.FunRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
