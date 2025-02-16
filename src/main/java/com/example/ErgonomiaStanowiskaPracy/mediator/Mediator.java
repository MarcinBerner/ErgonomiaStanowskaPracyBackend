package com.example.ErgonomiaStanowiskaPracy.mediator;

import com.example.ErgonomiaStanowiskaPracy.model.WorkerDB;
import com.example.ErgonomiaStanowiskaPracy.model.WorkerDTO;
import com.example.ErgonomiaStanowiskaPracy.services.WorkerService;
import com.example.ErgonomiaStanowiskaPracy.translator.*;
import org.springframework.stereotype.Component;

@Component
public class Mediator {

    public Mediator
            (TranslatorWorkerDBtoWorkerDTO translatorWorkerDBtoWorkerDTO,
             TranslatorQuestionDBtoQuestionDTO translatorQuestionDBtoQuestionDTO,
             TranslatorAnswerDBtoAnswerDTO translatorAnswerDBtoAnswerDTO,
             TranslatorWorkerDTOtoWorkerDB translatorWorkerDTOtoWorkerDB,
             TranslatorAnswerDTOtoAnswerDB translatorAnswerDTOtoAnswerDB,
             TransaltorQuestionDTOtoQuestionDB transaltorQuestionDTOtoQuestionDB,
             WorkerService workerService){
       this.translatorAnswerDBtoAnswerDTO = translatorAnswerDBtoAnswerDTO;
       this.translatorQuestionDBtoQuestionDTO = translatorQuestionDBtoQuestionDTO;
       this.translatorWorkerDBtoWorkerDTO = translatorWorkerDBtoWorkerDTO;
       this.translatorWorkerDTOtoWorkerDB = translatorWorkerDTOtoWorkerDB;
       this.transaltorQuestionDTOtoQuestionDB = transaltorQuestionDTOtoQuestionDB;
       this.translatorAnswerDTOtoAnswerDB = translatorAnswerDTOtoAnswerDB;


       this.workerService = workerService;

    }
    TranslatorQuestionDBtoQuestionDTO translatorQuestionDBtoQuestionDTO;
    TranslatorAnswerDBtoAnswerDTO translatorAnswerDBtoAnswerDTO;
    TranslatorWorkerDBtoWorkerDTO translatorWorkerDBtoWorkerDTO;
    TranslatorWorkerDTOtoWorkerDB translatorWorkerDTOtoWorkerDB;
    TransaltorQuestionDTOtoQuestionDB transaltorQuestionDTOtoQuestionDB;
    TranslatorAnswerDTOtoAnswerDB translatorAnswerDTOtoAnswerDB;
    WorkerService workerService;

    public void saveFamily(WorkerDTO workerDTO){
        WorkerDB workerDB = new WorkerDB();
        workerService.save(workerDB);
    }

}
