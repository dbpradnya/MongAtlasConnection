package com.spring.mongo.example.bootmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BootRepository extends MongoRepository<Person,String> {

    public List<Person> findByName (String name) ;

}
