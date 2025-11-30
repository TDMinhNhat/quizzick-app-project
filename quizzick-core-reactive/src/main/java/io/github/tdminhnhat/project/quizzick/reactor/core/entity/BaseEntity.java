package io.github.tdminhnhat.project.quizzick.reactor.core.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.relational.core.mapping.Column;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
@NoArgsConstructor
public abstract class BaseEntity {

    @Id
    @Column(value = "id")
    @Field(value = "id", targetType = FieldType.INT64)
    Long id;

    @CreatedDate
    @Column(value = "created_at")
    @Field(value = "created_at", targetType = FieldType.TIMESTAMP)
    Instant createdAt;

    @LastModifiedDate
    @Column(value = "updated_at")
    @Field(value = "updated_at", targetType = FieldType.TIMESTAMP)
    Instant updatedAt;

    @CreatedBy
    @Column(value = "created_by")
    @Field(value = "created_by", targetType = FieldType.STRING)
    String createdBy;

    @LastModifiedBy
    @Column(value = "updated_by")
    @Field(value = "updated_by", targetType = FieldType.STRING)
    String updatedBy;

    @Column(value = "deleted")
    @Field(value = "deleted", targetType = FieldType.BOOLEAN)
    Boolean deleted;

    @Version
    @Column(value = "version")
    @Field(value = "version", targetType = FieldType.INT64)
    Long version;
}
