package com.example.ErgonomiaStanowiskaPracy.services;

import com.example.ErgonomiaStanowiskaPracy.model.QuestionDB;
import com.example.ErgonomiaStanowiskaPracy.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {
   public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
    QuestionRepository questionRepository;

    public void saveAll(List<QuestionDB> questions) {
        questionRepository.saveAll(questions);
    }
}
