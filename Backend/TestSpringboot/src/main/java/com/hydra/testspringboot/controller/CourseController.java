package com.hydra.testspringboot.controller;

import com.hydra.testspringboot.model.Course;
import com.hydra.testspringboot.model.EnrolledStudents;
import com.hydra.testspringboot.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }

    @GetMapping("/available")
    public ResponseEntity<List<Course>> getALlCourse(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping("/enrolled")
    public ResponseEntity<List<EnrolledStudents>> getAllEnrolledStudents(){
        return new ResponseEntity<>(courseService.getAllEnrolledStudents(), HttpStatus.OK);
    }

    @GetMapping("/available/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable String courseId){
        return new ResponseEntity<>(courseService.getCourseById(courseId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @PostMapping("/register")
    public ResponseEntity<EnrolledStudents> saveEnroll(@RequestParam String name,
                                                       @RequestParam String emailId,
                                                       @RequestParam String courseName){
        return new ResponseEntity<>(courseService.saveEnroll(name, emailId, courseName), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{courseId}")
    public ResponseEntity<List<Course>> deleteById(@PathVariable String courseId){
        return new ResponseEntity<>(courseService.deleteById(courseId), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<List<Course>> deleteAllCourses(){
        return new ResponseEntity<>(courseService.deleteAllCourses(), HttpStatus.OK);
    }



}
