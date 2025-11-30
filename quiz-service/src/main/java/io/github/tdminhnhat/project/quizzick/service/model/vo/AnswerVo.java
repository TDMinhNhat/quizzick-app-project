package io.github.tdminhnhat.project.quizzick.service.model.vo;

import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AnswerVo extends BaseVo {
    String content;

    Boolean isCorrect;

    List<ImageVo> images;
}
