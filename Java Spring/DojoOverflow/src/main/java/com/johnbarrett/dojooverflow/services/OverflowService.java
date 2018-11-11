package com.johnbarrett.dojooverflow.services;

import org.springframework.stereotype.Service;

import com.johnbarrett.dojooverflow.repositories.AnswerRepo;
import com.johnbarrett.dojooverflow.repositories.QuestionRepo;
import com.johnbarrett.dojooverflow.repositories.TagQuestionRepo;
import com.johnbarrett.dojooverflow.repositories.TagRepo;

@Service
public class OverflowService {
	private final AnswerRepo answerRepo;
	private final QuestionRepo questionRepo;
	private final TagRepo tagRepo;
	private final TagQuestionRepo tagQuestionRepo;
	
	public OverflowService(AnswerRepo answerRepo, QuestionRepo questionRepo, TagRepo tagRepo, TagQuestionRepo tagQuestionRepo) {
		this.answerRepo = answerRepo;
		this.questionRepo = questionRepo;
		this.tagRepo = tagRepo;
		this.tagQuestionRepo = tagQuestionRepo;
	}
		
}