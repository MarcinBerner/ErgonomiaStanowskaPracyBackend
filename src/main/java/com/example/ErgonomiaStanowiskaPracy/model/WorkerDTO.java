package com.example.ErgonomiaStanowiskaPracy.model;



import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkerDTO {
    private long id;

    private String name;

    private String surname;

    private List<QuestionDTO> questions;
}
