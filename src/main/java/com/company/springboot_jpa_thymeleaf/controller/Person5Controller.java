package com.company.springboot_jpa_thymeleaf.controller;

import com.company.springboot_jpa_thymeleaf.bean.Person;
import com.company.springboot_jpa_thymeleaf.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person5")
public class Person5Controller {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("findFirstByNameOrderByIdDesc/{name}")
    public Person findFirstByNameOrderByIdDesc(@PathVariable Integer name) {
        return personRepository.findFirstByAgeOrderByIdDesc(name);
    }


    @GetMapping("findFirst5ByNameLikeOrderByIdDesc/{name}")
    public List<Person> findFirst10ByNameLikeOrderByIdDesc(@PathVariable String name) {
        return personRepository.findFirst10ByNameLikeOrderByIdDesc("%"+name+"%");
    }



    @GetMapping("findTopByNameOrderByIdAsc/{name}")
    public Person findTopByNameOrderByIdAsc(@PathVariable String name) {
        return personRepository.findTopByNameOrderByIdAsc(name);
    }

    @GetMapping("findTop10ByNameLikeOrderByIdAsc/{name}")
    public List<Person> findTop10ByNameLikeOrderByIdAsc(@PathVariable String name) {
        return personRepository.findTop10ByNameLikeOrderByIdAsc("%"+name+"%");
    }


    @GetMapping("findPerson/{id}")
    public Person findPerson(@PathVariable Long id) {
        return personRepository.findPerson(id);
    }

}
