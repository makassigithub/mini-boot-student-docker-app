package com.makassi.student.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.makassi.student.model.Student;
import com.makassi.student.repositories.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
