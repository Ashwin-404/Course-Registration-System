package com.example.Course.Registration.System.respository;

import com.example.Course.Registration.System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository
        extends JpaRepository<Course, String> {

}