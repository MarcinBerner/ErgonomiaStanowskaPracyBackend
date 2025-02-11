package com.example.ErgonomiaStanowiskaPracy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AnswerDTO {
    private int id;

    private QuestionDTO question;

    private int answerIndex;

    private String answerText;

    private int score;

}
