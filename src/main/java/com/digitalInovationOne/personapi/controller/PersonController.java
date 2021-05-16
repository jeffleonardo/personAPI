package com.digitalInovationOne.personapi.controller;

import com.digitalInovationOne.personapi.dto.MessageResponseDTO;
import com.digitalInovationOne.personapi.entity.Person;
import com.digitalInovationOne.personapi.repository.PersonRepository;
import com.digitalInovationOne.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
