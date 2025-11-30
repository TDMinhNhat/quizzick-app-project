package io.github.tdminhnhat.project.quizzick.service.repository;

import io.github.tdminhnhat.project.quizzick.service.entity.Question;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends ReactiveMongoRepository<Question, Long> {
}
