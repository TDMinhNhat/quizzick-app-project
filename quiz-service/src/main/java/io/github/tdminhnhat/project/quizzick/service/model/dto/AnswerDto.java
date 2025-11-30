package io.github.tdminhnhat.project.quizzick.service.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AnswerDto(

        @NotBlank(message = "can not be null or empty")
        String content,

        @NotNull(message = "can not be null or empty")
        Boolean isCorrect
) {
}
