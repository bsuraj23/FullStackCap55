package com.example.sample;

import org.springframework.web.bind.annotation.*;
@RestController
public class control {
    @GetMapping("/getHello")
    public String postHello(){
        return"Get-hello world";
    }
    @PostMapping("/postHello")
    public String getHello(){
        return"Post-hello world";
    }
    @RequestMapping("/Hello")
    public String putHello(@RequestParam(name="name",defaultValue="World")String name) {

        return "hello" + name;
    }
}
