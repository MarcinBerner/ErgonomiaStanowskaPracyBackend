package com.example.ErgonomiaStanowiskaPracy.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name="questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name =  "name", nullable = false)
    private String name;

    @Column(name = "number", nullable = false)
    private int number;

    @Column(name = "score", nullable = false)
    private int score;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnswerDB> answers;

}
