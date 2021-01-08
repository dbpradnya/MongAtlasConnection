package com.spring.mongo.example.bootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoController {

    @Autowired
    BootService service;
    @GetMapping(value="/test")
    public String returnString()
    {
        return "coronavirus";
    }

    @RequestMapping("/create")
    public Person create(@RequestParam String name, @RequestParam String email)
    {
        return service.create(name,email);
    }
}
