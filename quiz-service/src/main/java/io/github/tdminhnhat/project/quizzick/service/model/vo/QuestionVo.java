package io.github.tdminhnhat.project.quizzick.service.model.vo;

import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class QuestionVo extends BaseVo {

    String title;

    String description;

    Double point;

    Boolean isMultipleChoice;

    List<AnswerVo> answers;
}
