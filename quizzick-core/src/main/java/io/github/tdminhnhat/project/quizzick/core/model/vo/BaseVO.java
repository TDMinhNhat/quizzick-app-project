package io.github.tdminhnhat.project.quizzick.core.model.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BaseVO {
    Long id;

    Instant createdAt;

    Instant updatedAt;

    String createdBy;

    String updatedBy;

    Boolean deleted;

    Long version;
}
