package io.github.tdminhnhat.project.quizzick.service.model.dto;

import jakarta.validation.constraints.NotBlank;

public record QuizDto(

        @NotBlank(message = "can not be null or empty")
        String title,

        String description,

        @NotBlank(message = "can not be null or empty")
        Long owner
) {
}
