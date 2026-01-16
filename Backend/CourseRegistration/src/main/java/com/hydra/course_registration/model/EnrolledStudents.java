package com.hydra.course_registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class EnrolledStudents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String studentName;
    String studentEmailId;
    String course;

    public EnrolledStudents() {
    }

    public EnrolledStudents(String studentName, String studentEmailId, String course) {
        this.studentName = studentName;
        this.studentEmailId = studentEmailId;
        this.course = course;
    }
}
