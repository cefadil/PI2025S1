package br.univesp.pi2025s1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univesp.pi2025s1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);

}
