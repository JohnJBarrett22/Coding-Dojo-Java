package com.johnbarrett.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.dojooverflow.models.Answer;

@Repository
public interface AnswerRepo extends CrudRepository <Answer, Long> {

}
