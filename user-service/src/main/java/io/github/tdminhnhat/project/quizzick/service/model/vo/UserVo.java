package io.github.tdminhnhat.project.quizzick.service.model.vo;

import io.github.tdminhnhat.project.quizzick.core.model.vo.BaseVO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class UserVo extends BaseVO {
    String firstName;

    String lastName;

    LocalDate birthDate;

    String phoneNumber;

    String address;

    String avatar;

    String avatarUrl;

    String username;

    String email;

    String password;
}
