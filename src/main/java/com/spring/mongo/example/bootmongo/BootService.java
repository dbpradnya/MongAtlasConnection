package com.spring.mongo.example.bootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class BootService {

    @Autowired
    BootRepository repo;

    public Person create(String name, String email)
    {
        return repo.save(new Person(name,email));
    }
}
