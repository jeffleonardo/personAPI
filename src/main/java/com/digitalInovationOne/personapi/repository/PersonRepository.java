package com.digitalInovationOne.personapi.repository;

import com.digitalInovationOne.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
