package com.example.Embeddable_Embedded.service;

import com.example.Embeddable_Embedded.entity.Person;
import com.example.Embeddable_Embedded.repository.PersonRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonRepo repo;

    public Person save(Person person){
        return repo.save(person);
    }
}
