package com.example.ErgonomiaStanowiskaPracy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "answers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDB {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id", nullable = false)
    private QuestionDB question;

    @Column(name = "answer_index", nullable = false)
    private int answerIndex;

    @Column(name = "answer_text", nullable = false)
    private String answerText; // Treść odpowiedzi (np. "Krzesło jest na odpowiedniej wysokości")

    @Column(name = "score", nullable = false)
    private int score; // Punktacja ROSA dla tej odpowiedzi
}