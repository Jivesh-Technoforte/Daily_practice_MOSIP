package com.technoforte.jivesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/jivesh")
    public String myMethod() {
        return "<h1>Welcome to Jivesh Page</h1>"; 
    }
    
    @GetMapping("/addition")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        int res = num1 + num2;
        return "Result = " + res; 
    }
    
    @GetMapping("/subtraction")
    public String subtract(@RequestParam int num3, @RequestParam int num4) {
        int result = num3 - num4;
        return "Result = " + result; 
    }
    
    @GetMapping("/multi")
    public String multi(@RequestParam int num5, @RequestParam int num6) {
        int result = num5 * num6;
        return "Result = " + result; 
    }
    
    @GetMapping("/div")
    public String div(@RequestParam int num7, @RequestParam int num8) {
        int result = num7 / num8;
        return "Result = " + result; 
    }
}
