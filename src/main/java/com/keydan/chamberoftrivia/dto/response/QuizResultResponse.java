package com.keydan.chamberoftrivia.dto.response;

import com.keydan.chamberoftrivia.Model.Enums.QuizResult;

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
public class QuizResultResponse {

    private Integer score;
    private Integer maxScore;
    private QuizResult result;
}
