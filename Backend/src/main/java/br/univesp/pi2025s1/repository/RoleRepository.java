package br.univesp.pi2025s1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univesp.pi2025s1.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
