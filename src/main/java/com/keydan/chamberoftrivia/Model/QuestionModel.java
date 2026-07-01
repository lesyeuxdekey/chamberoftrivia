package com.keydan.chamberoftrivia.Model;

import java.util.List;

import com.keydan.chamberoftrivia.Model.Enums.Difficulty;
import com.keydan.chamberoftrivia.Model.Enums.QuestionType;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionModel {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryModel category;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private Integer points;

    @Enumerated(EnumType.STRING)
    private QuestionType questionType;

    @ElementCollection
    private List<String> answerOptions;

    private Integer correctAnswerIndex;
}
