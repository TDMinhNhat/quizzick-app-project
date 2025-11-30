package io.github.tdminhnhat.project.quizzick.service.entity;

import io.github.tdminhnhat.project.quizzick.reactor.core.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Document(value = "questions")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Question extends BaseEntity {

    @Field(value = "quiz_id", targetType = FieldType.INT64)
    Long quizId;

    @Field(value = "title", targetType = FieldType.STRING)
    String title;

    @Field(value = "description", targetType = FieldType.STRING)
    String description;

    @Field(value = "point", targetType = FieldType.DOUBLE)
    Double point;

    @Field(value = "icon", targetType = FieldType.STRING)
    String icon;

    @Field(value = "is_multiple_choice", targetType = FieldType.BOOLEAN)
    Boolean isMultipleChoice;

    @Field(value = "images", targetType = FieldType.ARRAY)
    List<String> images;

    @Field(value = "answers", targetType = FieldType.ARRAY)
    List<Answer> answers;
}
