package io.github.tdminhnhat.project.quizzick.core.model.dto;

import jakarta.validation.constraints.Size;
import org.springframework.data.domain.Sort;

public record SortRequestDTO(
        @Size(max = 100, message = "must not exceed {max} characters")
        String propertyName,

        Sort.Direction direction
) {

    public Sort.Order getSortOrder() {
        return new Sort.Order(direction, propertyName);
    }
}
