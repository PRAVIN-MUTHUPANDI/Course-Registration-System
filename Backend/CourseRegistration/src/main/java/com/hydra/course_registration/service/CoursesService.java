package com.hydra.course_registration.service;

import com.hydra.course_registration.model.Courses;
import com.hydra.course_registration.model.EnrolledStudents;
import com.hydra.course_registration.repository.CoursesRepository;
import com.hydra.course_registration.repository.EnrolledStudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    CoursesRepository coursesRepository;
    @Autowired
    EnrolledStudentsRepository enrolledStudentsRepository;

    public List<Courses> getAllCourses(){
        return coursesRepository.findAll();
    }

    public List<EnrolledStudents> getEnrolledStudents(){
        return enrolledStudentsRepository.findAll();
    }

    public void enrollStudent(String name, String email, String course){
        EnrolledStudents enrolledStudents = new EnrolledStudents(name, email, course);
        enrolledStudentsRepository.save(enrolledStudents);
    }
}
