package com.example.springbatch.service.impl;

import com.example.springbatch.model.Student;
import com.example.springbatch.repository.IStudentRepository;
import com.example.springbatch.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }
}