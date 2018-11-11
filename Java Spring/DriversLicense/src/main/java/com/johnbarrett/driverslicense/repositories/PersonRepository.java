package com.johnbarrett.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.driverslicense.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findAll();	
}