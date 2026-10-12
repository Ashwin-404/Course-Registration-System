package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;

import com.example.Course.Registration.System.model.courseRegistration;
import com.example.Course.Registration.System.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {
        "http://localhost:5500",
        "http://127.0.0.1:5500"
})
public class courseController {
    @Autowired
    courseService c;

    @GetMapping("/courses")
     public List<Course> getAvailableCourses() {
           return c.getAvailableCourses();
     }

     @GetMapping("/course/enrolled")
    public List<courseRegistration> getEnrolledCourses() {
        return c.getEnrolledCourse();
     }

     @PostMapping("/course/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("email") String email,
                                 @RequestParam("courseName") String courseName) {
        c.registerCourse(name,email,courseName);
        return "Congratulation!! "+name+" You have Enrolled Successfully for !"+courseName;
     }
}
