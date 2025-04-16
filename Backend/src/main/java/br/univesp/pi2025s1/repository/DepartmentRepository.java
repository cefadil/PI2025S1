package br.univesp.pi2025s1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univesp.pi2025s1.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
