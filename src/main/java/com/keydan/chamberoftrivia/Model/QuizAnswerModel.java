package com.keydan.chamberoftrivia.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class QuizAnswerModel {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private GameModel session;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionModel question;

}
