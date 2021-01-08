package com.spring.mongo.example.bootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BootmongoApplication implements CommandLineRunner {

    @Autowired
    BootRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(BootmongoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    	System.out.println("I m here");
        repository.deleteAll();

        List<Person> prsonList = new ArrayList<>();

        Person p1 = new Person("pradnya", "p@email.com");
        Person p2 = new Person("chandi", "c@email.com");
        Person p3 = new Person("pradnya", "p@email.com");
        Person p4 = new Person("sandip", "s@email.com");
		prsonList.add(p1);
		prsonList.add(p2);
		prsonList.add(p3);
		prsonList.add(p4);

        Iterable<Person> personIterable = prsonList;

        repository.saveAll(personIterable);

        repository.findAll().forEach(x -> System.out.println(x.toString()));
    }
}
