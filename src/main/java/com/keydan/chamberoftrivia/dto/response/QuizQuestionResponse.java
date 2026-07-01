package com.keydan.chamberoftrivia.dto.response;

import java.util.List;

import com.keydan.chamberoftrivia.Model.Enums.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuizQuestionResponse {

    private Long id;

    private String questionText;

    private QuestionType questionType;

    private List<String> answerOptions;
}
