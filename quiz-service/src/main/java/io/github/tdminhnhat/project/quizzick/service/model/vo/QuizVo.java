package io.github.tdminhnhat.project.quizzick.service.model.vo;

import io.github.tdminhnhat.project.quizzick.reactor.core.model.vo.BaseVo;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class QuizVo extends BaseVo {

    String title;

    String description;

    ImageVo avatar;

    Long owner;
}
