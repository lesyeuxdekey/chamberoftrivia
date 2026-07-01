package com.keydan.chamberoftrivia.dto.response;

import java.util.List;

import com.keydan.chamberoftrivia.Model.Enums.Difficulty;
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
public class QuestionResponse {

    private Long id;
    private String questionText;
    private Difficulty difficulty;
    private Integer points;
    private QuestionType questionType;
    private String categoryName;
    private List<String> answerOptions;
}