package io.github.tdminhnhat.project.quizzick.service.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.List;

public record QuestionDto(

        @NotBlank(message = "can not be null or empty")
        String title,

        String description,

        @NotNull(message = "can not be null or empty")
        @Positive(message = "must be a positive number")
        Double point,

        @NotBlank(message = "can not be null or empty")
        Boolean isMultipleChoice,

        @NotNull(message = "can not be null or empty")
        @Size(min = 2, message = "at least {min} answers are required")
        List<AnswerDto> answers
) {
}
