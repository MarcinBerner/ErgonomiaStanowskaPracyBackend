package com.example.ErgonomiaStanowiskaPracy.services;

import com.example.ErgonomiaStanowiskaPracy.model.AnswerDB;
import com.example.ErgonomiaStanowiskaPracy.model.QuestionDB;
import com.example.ErgonomiaStanowiskaPracy.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    AnswerService (AnswerRepository answerRepository){
        this.answerRepository = answerRepository;
    }
    AnswerRepository answerRepository;

    public void saveAll(List<AnswerDB> answers) {
        answerRepository.saveAll(answers);
    }
}
