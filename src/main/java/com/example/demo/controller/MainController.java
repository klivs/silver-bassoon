package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class MainController {

    private final PersonRepository personRepository;

    public MainController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/index")
    public ModelAndView index(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView("index");
        httpSession.getAttributeNames().asIterator().forEachRemaining(log::info);
        modelAndView.addObject("persons", personRepository.findAll());
        return modelAndView;
    }
}
