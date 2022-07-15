package com.example.demo.rest;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainRestController {

    private final PersonRepository personRepository;

    public MainRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/rest")
    public List<Person> rest() {

        return this.personRepository.findAll();
    }
}
