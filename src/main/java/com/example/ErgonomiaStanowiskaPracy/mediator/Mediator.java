package com.example.ErgonomiaStanowiskaPracy.mediator;

import com.example.ErgonomiaStanowiskaPracy.model.*;
import com.example.ErgonomiaStanowiskaPracy.services.AnswerService;
import com.example.ErgonomiaStanowiskaPracy.services.QuestionService;
import com.example.ErgonomiaStanowiskaPracy.services.WorkerService;
import com.example.ErgonomiaStanowiskaPracy.translator.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mediator {

    public Mediator
            (TranslatorWorkerDBtoWorkerDTO translatorWorkerDBtoWorkerDTO,
             TranslatorQuestionDBtoQuestionDTO translatorQuestionDBtoQuestionDTO,
             TranslatorAnswerDBtoAnswerDTO translatorAnswerDBtoAnswerDTO,
             TranslatorWorkerDTOtoWorkerDB translatorWorkerDTOtoWorkerDB,
             TranslatorAnswerDTOtoAnswerDB translatorAnswerDTOtoAnswerDB,
             TransaltorQuestionDTOtoQuestionDB transaltorQuestionDTOtoQuestionDB,
             WorkerService workerService,
             AnswerService answerService,
             QuestionService questionService){
       this.translatorAnswerDBtoAnswerDTO = translatorAnswerDBtoAnswerDTO;
       this.translatorQuestionDBtoQuestionDTO = translatorQuestionDBtoQuestionDTO;
       this.translatorWorkerDBtoWorkerDTO = translatorWorkerDBtoWorkerDTO;
       this.translatorWorkerDTOtoWorkerDB = translatorWorkerDTOtoWorkerDB;
       this.transaltorQuestionDTOtoQuestionDB = transaltorQuestionDTOtoQuestionDB;
       this.translatorAnswerDTOtoAnswerDB = translatorAnswerDTOtoAnswerDB;

       this.workerService = workerService;
       this.questionService = questionService;
       this.answerService = answerService;

    }
    TranslatorQuestionDBtoQuestionDTO translatorQuestionDBtoQuestionDTO;
    TranslatorAnswerDBtoAnswerDTO translatorAnswerDBtoAnswerDTO;
    TranslatorWorkerDBtoWorkerDTO translatorWorkerDBtoWorkerDTO;
    TranslatorWorkerDTOtoWorkerDB translatorWorkerDTOtoWorkerDB;
    TransaltorQuestionDTOtoQuestionDB transaltorQuestionDTOtoQuestionDB;
    TranslatorAnswerDTOtoAnswerDB translatorAnswerDTOtoAnswerDB;
    WorkerService workerService;
    QuestionService questionService;
    AnswerService answerService;

    public void saveQuestionnaire(WorkerDTO workerDTO, List<QuestionDTO> questions, List<AnswerDTO> answers){
       WorkerDB worker = translatorWorkerDTOtoWorkerDB.toWorkerDB(workerDTO);
       List<QuestionDB> questionsDB = questions.stream()
               .map(transaltorQuestionDTOtoQuestionDB::toQuestionDB)
               .collect(Collectors.toList());
       List<AnswerDB> answersDB = answers.stream()
               .map(translatorAnswerDTOtoAnswerDB::toAnswerDB)
               .collect(Collectors.toList());
       workerService.save(worker);
       questionService.saveAll(questionsDB);
       answerService.saveAll(answersDB);
    }

}
