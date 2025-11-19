package io.github.tdminhnhat.project.quizzick.service.repository;

import io.github.tdminhnhat.project.quizzick.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
