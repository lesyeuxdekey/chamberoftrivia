package com.keydan.chamberoftrivia.dto.request;

import java.util.List;

import com.keydan.chamberoftrivia.Model.Enums.Difficulty;
import com.keydan.chamberoftrivia.Model.Enums.QuestionType;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
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
public class QuestionRequest {

    @NotBlank
    private String questionText;

    @NotNull
    private Difficulty difficulty;

    @NotNull
    @Positive
    private Integer points;

    @NotNull
    private QuestionType questionType;

    @NotNull
    private Long categoryId;

    @NotEmpty
    @Size(min = 2, max = 4)
    private List<String> answerOptions;

    @NotNull
    @Min(0)
    private Integer correctAnswerIndex;
}