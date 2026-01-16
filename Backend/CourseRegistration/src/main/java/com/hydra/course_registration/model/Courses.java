package com.hydra.course_registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Courses {

    @Id
    int courseId;
    String courseName;
    String trainer;
    String durationInWeeks;

}
