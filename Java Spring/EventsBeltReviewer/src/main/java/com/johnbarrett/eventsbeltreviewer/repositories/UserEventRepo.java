package com.johnbarrett.eventsbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.eventsbeltreviewer.models.UserEvent;

@Repository
public interface UserEventRepo extends CrudRepository<UserEvent, Long> {

}
