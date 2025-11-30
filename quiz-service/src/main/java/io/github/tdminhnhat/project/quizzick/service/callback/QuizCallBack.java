package io.github.tdminhnhat.project.quizzick.service.callback;

import io.github.tdminhnhat.project.quizzick.reactor.core.callback.IEntityCallBack;
import io.github.tdminhnhat.project.quizzick.service.entity.Quiz;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.Document;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class QuizCallBack implements IEntityCallBack<Quiz> {

    MongoTemplate mongoTemplate;

    @Override
    public Quiz onBeforeSave(Quiz entity, Document document, String collection) {
        Long getCurrentMaxId = mongoTemplate.find(new Query().with(Sort.by(Sort.Direction.DESC, "id")).limit(1), Quiz.class).getFirst().getId();
        entity.setId(getCurrentMaxId + 1);
        return entity;
    }
}
