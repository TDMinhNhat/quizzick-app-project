package io.github.tdminhnhat.project.quizzick.service.callback;

import io.github.tdminhnhat.project.quizzick.reactor.core.callback.IEntityCallBack;
import io.github.tdminhnhat.project.quizzick.service.entity.Question;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.Document;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class QuestionCallBack implements IEntityCallBack<Question> {

    @Override
    public Question onBeforeSave(Question entity, Document document, String collection) {
        return null;
    }
}
