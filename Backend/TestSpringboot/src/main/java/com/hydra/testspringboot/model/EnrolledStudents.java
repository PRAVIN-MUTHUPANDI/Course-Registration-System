package com.hydra.testspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EnrolledStudents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long serialNum;
    private String name;
    private String emailId;
    private String courseName;

    public EnrolledStudents(String name, String emailId, String courseName){
        this.name=courseName;
        this.emailId=emailId;
        this.courseName=courseName;
    }
}
