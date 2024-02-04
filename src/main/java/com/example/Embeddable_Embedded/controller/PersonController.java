package com.example.Embeddable_Embedded.controller;

import com.example.Embeddable_Embedded.entity.Person;
import com.example.Embeddable_Embedded.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController {

    private PersonService personService;

    @PostMapping()
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }
}
