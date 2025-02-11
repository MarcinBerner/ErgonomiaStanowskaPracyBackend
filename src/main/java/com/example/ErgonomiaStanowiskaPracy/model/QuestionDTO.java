package com.example.ErgonomiaStanowiskaPracy.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {
    private int id;

    private String name;

    private int number;


    private int score;


    private List<AnswerDTO> answers;

}
