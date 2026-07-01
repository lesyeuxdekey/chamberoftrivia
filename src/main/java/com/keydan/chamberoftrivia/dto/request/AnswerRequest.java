package com.keydan.chamberoftrivia.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerRequest {

    @NotNull(message = "Question id is required")
    private Long questionId;

    @NotNull(message = "Selected answer is required")
    @Min(value = 0, message = "Index cannot be negative")
    private Integer selectedAnswerIndex;
}