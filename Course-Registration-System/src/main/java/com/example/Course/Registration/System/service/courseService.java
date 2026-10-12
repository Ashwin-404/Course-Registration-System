package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.courseRegistration;
import com.example.Course.Registration.System.respository.courseRegirtrationREPO;
import com.example.Course.Registration.System.respository.courseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {
    @Autowired
     courseRepository cr;
    @Autowired
    courseRegirtrationREPO crp;


    public List<Course> getAvailableCourses() {
        return cr.findAll();
    }

    public List<courseRegistration> getEnrolledCourse() {
        return crp.findAll();
    }

    public void registerCourse(String name, String email, String courseName) {
        courseRegistration c=new courseRegistration(name,email,courseName);
        crp.save(c);

    }
}
