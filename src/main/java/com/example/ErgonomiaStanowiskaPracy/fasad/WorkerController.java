package com.example.ErgonomiaStanowiskaPracy.fasad;

import com.example.ErgonomiaStanowiskaPracy.mediator.Mediator;
import com.example.ErgonomiaStanowiskaPracy.model.AnswerDTO;
import com.example.ErgonomiaStanowiskaPracy.model.QuestionDTO;
import com.example.ErgonomiaStanowiskaPracy.model.WorkerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    private Mediator mediator;

    public void saveQuestionnaire(@RequestBody WorkerDTO workerDTO,
                                  @RequestBody List<QuestionDTO> questions,
                                  @RequestBody List<AnswerDTO> answers){
        mediator.saveQuestionnaire(workerDTO,questions,answers);

    }
    public void getWorker(){

    }
    public void getAllWorkers(){

    }

}
