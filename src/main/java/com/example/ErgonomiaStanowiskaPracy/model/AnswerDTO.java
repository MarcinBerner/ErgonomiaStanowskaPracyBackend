package com.example.ErgonomiaStanowiskaPracy.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnswerDTO {
    private int id;

    private QuestionDTO question;

    private int answerIndex;

    private String answerText;

    private int score;

}
