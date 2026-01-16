package com.hydra.course_registration.repository;

import com.hydra.course_registration.model.EnrolledStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledStudentsRepository extends JpaRepository<EnrolledStudents, Integer> {
}
