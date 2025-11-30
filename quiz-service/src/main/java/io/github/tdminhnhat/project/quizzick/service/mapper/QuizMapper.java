package io.github.tdminhnhat.project.quizzick.service.mapper;

import io.github.tdminhnhat.project.quizzick.service.entity.Quiz;
import io.github.tdminhnhat.project.quizzick.service.model.dto.QuizDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.QuizVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuizMapper {

    Quiz toEntity(QuizDto request);

    QuizVo toVo(Quiz entity);
}
