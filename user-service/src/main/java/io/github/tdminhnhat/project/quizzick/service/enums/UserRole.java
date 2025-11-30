package io.github.tdminhnhat.project.quizzick.service.enums;

import lombok.Getter;

@Getter
public enum UserRole {
    USER("USER"), MANAGER("MANAGER"), ADMIN("ADMIN");

    private final String roleName;

    UserRole(String roleName) {
        this.roleName = roleName;
    }
}
