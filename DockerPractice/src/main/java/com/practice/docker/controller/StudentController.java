package com.practice.docker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.docker.entity.Student;
import com.practice.docker.repo.StudentRepo;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo repo;

    public StudentController(StudentRepo repo) {
        this.repo = repo;
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return repo.save(s);
    }

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }
}
