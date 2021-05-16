package com.digitalInovationOne.personapi.service;

import com.digitalInovationOne.personapi.dto.MessageResponseDTO;
import com.digitalInovationOne.personapi.entity.Person;
import com.digitalInovationOne.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public MessageResponseDTO createPerson(Person person){
        Person savePerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savePerson.getId())
                .build();
    }
}
