package com.makassi.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makassi.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
