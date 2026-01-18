package com.hydra.testspringboot.service;

import com.hydra.testspringboot.model.Course;
import com.hydra.testspringboot.model.EnrolledStudents;
import com.hydra.testspringboot.repository.CourseRepository;
import com.hydra.testspringboot.repository.EnrolledStudentsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final EnrolledStudentsRepository enrolledStudentsRepository;

    public CourseService(CourseRepository courseRepository, EnrolledStudentsRepository enrolledStudentsRepository){
        this.courseRepository=courseRepository;
        this.enrolledStudentsRepository=enrolledStudentsRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(String courseId){
        return courseRepository.findById(courseId).orElseThrow(() -> new EntityNotFoundException("CourseId not available" + courseId));
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
    public List<Course> deleteById(String courseId){
        courseRepository.deleteById(courseId);
        return courseRepository.findAll();
    }

    public List<Course> deleteAllCourses(){
        courseRepository.deleteAll();
        return courseRepository.findAll();
    }

    public EnrolledStudents saveEnroll(String name, String emailId, String courseName){
        EnrolledStudents enrolledStudents=new EnrolledStudents(name, emailId, courseName);
        return enrolledStudentsRepository.save(enrolledStudents);
    }

    public List<EnrolledStudents> getAllEnrolledStudents(){
        return enrolledStudentsRepository.findAll();
    }

}
