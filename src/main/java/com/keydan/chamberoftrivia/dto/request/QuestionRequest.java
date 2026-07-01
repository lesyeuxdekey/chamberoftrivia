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

     @NotBlank(message = "Question text is required")
    private String questionText;

    @NotNull(message = "Difficulty is required")
    private Difficulty difficulty;

    @NotNull(message = "Points are required")
    @Positive(message = "Points must be positive")
    private Integer points;

    @NotNull(message = "Question type is required")
    private QuestionType questionType;

    @NotNull(message = "Category is required")
    private Long categoryId;

    @NotEmpty(message = "Answer options cannot be empty")
    @Size(min = 2, max = 4, message = "Answer options must be between 2 and 4")
    private List<String> answerOptions;

    @NotNull(message = "Correct answer index is required")
    @Min(value = 0, message = "Index cannot be negative")
    private Integer correctAnswerIndex;
}