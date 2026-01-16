package com.hydra.course_registration.controller;

import com.hydra.course_registration.model.Courses;
import com.hydra.course_registration.model.EnrolledStudents;
import com.hydra.course_registration.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
//@CrossOrigin(origins = "http://localhost:5501")
public class CoursesController {

    @Autowired
    CoursesService coursesService;

    @GetMapping("/available")
    public ResponseEntity<List<Courses>> getAllCourses(){
        return new ResponseEntity<>(coursesService.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping("/enrolled")
    public List<EnrolledStudents> getEnrolledStudents(){
        return coursesService.getEnrolledStudents();
    }

    @PostMapping("/register")
    public String enrollStudent(@RequestParam String name, @RequestParam String email, @RequestParam String courseName){
        coursesService.enrollStudent(name, email, courseName);
        return "Congratulations " + name + "! Enrollment Successful for " + courseName;
    }
}
