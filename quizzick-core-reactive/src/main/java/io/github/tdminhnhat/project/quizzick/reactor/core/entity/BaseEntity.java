package io.github.tdminhnhat.project.quizzick.reactor.core.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Column;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
@NoArgsConstructor
public abstract class BaseEntity {

    @Id
    @Column(value = "id")
    Long id;

    @CreatedDate
    @Column(value = "created_at")
    Instant createdAt;

    @LastModifiedDate
    @Column(value = "updated_at")
    Instant updatedAt;

    @CreatedBy
    @Column(value = "created_by")
    String createdBy;

    @LastModifiedBy
    @Column(value = "updated_by")
    String updatedBy;

    @Column(value = "deleted")
    Boolean deleted;

    @Version
    @Column(value = "version")
    Long version;
}
