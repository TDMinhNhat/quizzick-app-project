package io.github.tdminhnhat.project.quizzick.service.entity;

import io.github.tdminhnhat.project.quizzick.reactor.core.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(value = "quizzes")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Quiz extends BaseEntity {

    @Field(value = "title", targetType = FieldType.STRING)
    String title;

    @Field(value = "description", targetType = FieldType.STRING)
    String description;

    @Field(value = "avatar", targetType = FieldType.STRING)
    String avatar;

    @Field(value = "owner", targetType = FieldType.INT64)
    Long owner;
}
