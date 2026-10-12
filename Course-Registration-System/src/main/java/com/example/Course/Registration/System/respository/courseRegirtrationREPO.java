package com.example.Course.Registration.System.respository;

import com.example.Course.Registration.System.model.courseRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRegirtrationREPO
        extends JpaRepository<courseRegistration, Integer> {

}