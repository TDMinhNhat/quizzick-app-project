package io.github.tdminhnhat.project.quizzick.service.entity;

import io.github.tdminhnhat.project.quizzick.reactor.core.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Answer extends BaseEntity {

    @Field(value = "content", targetType = FieldType.STRING)
    String content;

    @Field(value = "is_correct", targetType = FieldType.BOOLEAN)
    Boolean isCorrect;

    @Field(value = "images", targetType = FieldType.ARRAY)
    List<String> images;
}
