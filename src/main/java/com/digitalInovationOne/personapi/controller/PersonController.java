package com.digitalInovationOne.personapi.controller;

import com.digitalInovationOne.personapi.dto.MessageResponseDTO;
import com.digitalInovationOne.personapi.entity.Person;
import com.digitalInovationOne.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savePerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savePerson.getId())
                .build();
    }
}
