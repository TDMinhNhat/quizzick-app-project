package io.github.tdminhnhat.project.quizzick.reactor.core.callback;

import org.bson.Document;
import org.springframework.data.mongodb.core.mapping.event.AfterConvertCallback;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveCallback;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveCallback;

public interface IEntityCallBack<T> extends BeforeSaveCallback<T>, AfterSaveCallback<T>, BeforeConvertCallback<T>, AfterConvertCallback<T> {

    @Override
    default T onAfterConvert(T entity, Document document, String collection) {
        return null;
    }

    @Override
    default T onAfterSave(T entity, Document document, String collection) {
        return null;
    }

    @Override
    default T onBeforeConvert(T entity, String collection) {
        return null;
    }

    @Override
    default T onBeforeSave(T entity, Document document, String collection) {
        return null;
    }
}
