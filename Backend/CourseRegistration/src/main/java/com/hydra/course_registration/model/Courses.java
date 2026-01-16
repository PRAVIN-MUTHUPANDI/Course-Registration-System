package com.hydra.course_registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Courses {

    @Id
    Integer courseId;
    String courseName;
    String trainer;
    String durationInWeeks;

}
