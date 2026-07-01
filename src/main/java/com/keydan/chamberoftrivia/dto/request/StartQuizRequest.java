package com.keydan.chamberoftrivia.dto.request;

import com.keydan.chamberoftrivia.Model.Enums.Difficulty;

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
public class StartQuizRequest {
    private Long categoryId;
    private Integer questionAmount;
    private Difficulty difficulty;
}
