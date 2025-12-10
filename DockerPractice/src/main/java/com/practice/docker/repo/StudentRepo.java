package com.practice.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.docker.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {}