package com.springdata.springdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "surname",nullable = false)
    private String surname;

    @Column(name = "birth_date",nullable = false)
    private Integer dateOfBirth;

    @Column(name = "student_number",nullable = false)
    private Integer studentNumber;
    
}
