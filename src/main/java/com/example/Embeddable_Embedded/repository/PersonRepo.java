package com.example.Embeddable_Embedded.repository;

import com.example.Embeddable_Embedded.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
