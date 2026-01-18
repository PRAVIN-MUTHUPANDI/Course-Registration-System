package com.hydra.testspringboot.repository;

import com.hydra.testspringboot.model.EnrolledStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledStudentsRepository extends JpaRepository<EnrolledStudents, Long> {
}
