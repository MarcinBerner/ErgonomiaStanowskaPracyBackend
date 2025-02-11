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
public class WorkerDTO {
    private long id;

    private String name;

    private String surname;

    private List<QuestionDTO> questions;
}
