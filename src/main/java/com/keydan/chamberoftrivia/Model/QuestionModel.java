package com.keydan.chamberoftrivia.Model;

import com.keydan.chamberoftrivia.Model.Enums.Dificulty;
import com.keydan.chamberoftrivia.Model.Enums.QuestionType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
public class QuestionModel {
    @Id
    private Long id;
    private String questionText;
    private Dificulty dificulty;
    private Integer points;
    private QuestionType questionType;
    private List<String> answerOptions;
    private Integer correctAnswerIndex;
}
