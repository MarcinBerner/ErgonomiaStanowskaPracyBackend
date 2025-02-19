package com.example.ErgonomiaStanowiskaPracy.model;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionDTO {
    private int id;

    private String name;

    private int number;


    private int score;


    private List<AnswerDTO> answers;

}
