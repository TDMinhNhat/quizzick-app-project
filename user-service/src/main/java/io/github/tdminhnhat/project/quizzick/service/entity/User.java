package io.github.tdminhnhat.project.quizzick.service.entity;

import io.github.tdminhnhat.project.quizzick.core.entity.BaseEntity;
import io.github.tdminhnhat.project.quizzick.service.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity @Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor @RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    @Column(name = "first_name", nullable = false, length = 100)
    @NonNull
    String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
            @NonNull
    String lastName;

    @Column(name = "sex", nullable = false) @NonNull
    Boolean sex;

    @Column(name = "birth_date", nullable = false) @NonNull
    LocalDate birthDate;

    @Column(name = "phone_number", nullable = false, length = 30) @NonNull
    String phoneNumber;

    @Column(name = "address", length = 300)
    String address;

    @Column(name = "avatar", length = 100)
    String avatar;

    @Column(name = "user_name", length = 100, nullable = false) @NonNull
    String username;

    @Column(name = "email", length = 200, nullable = false) @NonNull
    String email;

    @Column(name = "password", nullable = false, length = 100) @NonNull
    String password;

    @Enumerated(EnumType.STRING) @Column(name = "role", nullable = false, length = 50)
    UserRole role;

    public User(@NonNull String firstName, @NonNull String lastName, @NonNull Boolean sex, @NonNull LocalDate birthDate, @NonNull String phoneNumber, String address, String avatar, @NonNull String username, @NonNull String email, @NonNull String password, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.avatar = avatar;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role == null ? UserRole.USER : role;
    }
}
