package io.github.tdminhnhat.project.quizzick.service.model.dto;

import java.time.LocalDate;

public record UserDto(
        String firstName,

        String lastName,

        LocalDate birthDate,

        String phoneNumber,

        String address,

        String avatar,

        String username,

        String email,

        String password
) {
}
