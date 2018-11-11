package com.johnbarrett.eventsbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.eventsbeltreviewer.models.Event;


@Repository
public interface EventRepo extends CrudRepository <Event, Long> {

}