package com.keydan.chamberoftrivia.dto.response;

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
public class QuizSessionResponse {

    private Long sessionId;

    private Integer score;

    private Integer maxScore;

    private Boolean finished;
}