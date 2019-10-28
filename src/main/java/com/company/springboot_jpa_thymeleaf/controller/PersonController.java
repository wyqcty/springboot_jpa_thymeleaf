package com.company.springboot_jpa_thymeleaf.controller;

import com.company.springboot_jpa_thymeleaf.bean.Person;
import com.company.springboot_jpa_thymeleaf.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(path="addPerson")
    public void addPerson(@RequestBody Person person) {
        personRepository.save(person);
    }


    @GetMapping(path="getAllPerson")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @PutMapping(path="updatePerson")
    public void updatePerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }


}
