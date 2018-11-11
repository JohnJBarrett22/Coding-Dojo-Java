package com.johnbarrett.eventsbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.eventsbeltreviewer.models.User;

@Repository
public interface UserRepo extends CrudRepository <User, Long> {
	  User findByEmail(String email);
}