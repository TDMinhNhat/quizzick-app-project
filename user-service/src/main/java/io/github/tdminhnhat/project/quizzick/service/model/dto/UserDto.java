package io.github.tdminhnhat.project.quizzick.service.model.dto;

import io.github.tdminhnhat.project.quizzick.service.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record UserDto(

        @NotBlank(message = "can not be null or empty")
        @Size(max = 100, message = "max length is {max} characters")
        String firstName,

        @NotBlank(message = "can not be null or empty")
        @Size(max = 100, message = "max length is {max} characters")
        String lastName,

        @NotNull(message = "can not be null or empty")
        @PastOrPresent(message = "must be a past or present date")
        LocalDate birthDate,

        @NotBlank(message = "can not be null or empty")
        @Size(max = 30, message = "max length is {max} characters")
        String phoneNumber,

        @Size(max = 300, message = "max length is {max} characters")
        String address,

        @NotBlank(message = "can not be null or empty")
        @Size(max = 100, message = "max length is {max} characters")
        String username,

        @NotBlank(message = "can not be null or empty")
        @Size(max = 200, message = "max length is {max} characters")
        String email,

        @NotBlank(message = "can not be null or empty")
        @Size(max = 100, message = "max length is {max} characters")
        String password,

        UserRole role
) {
}
