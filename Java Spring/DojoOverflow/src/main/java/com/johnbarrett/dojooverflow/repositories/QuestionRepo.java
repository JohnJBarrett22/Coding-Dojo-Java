package com.johnbarrett.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.dojooverflow.models.Question;

@Repository
public interface QuestionRepo extends CrudRepository <Question, Long> {

}
