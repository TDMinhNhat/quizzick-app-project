package io.github.tdminhnhat.project.quizzick.reactor.core.config;

import jakarta.validation.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import org.springframework.data.mongodb.core.mapping.event.ReactiveValidatingEntityCallback;

@Configuration
@EnableReactiveMongoAuditing
public class MongoConfig {

    @Bean
    public ReactiveValidatingEntityCallback validatingEntityCallback(Validator validator) {
        return new ReactiveValidatingEntityCallback(validator);
    }
}
