package io.github.tdminhnhat.project.quizzick.core.model.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;

public record PageRequestDTO(

        @PositiveOrZero(message = "must be greater than or equal to 0")
        Long page,

        @Positive(message = "must be greater than 0")
        Long size,

        List<SortRequestDTO> sortRequests
) {
}
