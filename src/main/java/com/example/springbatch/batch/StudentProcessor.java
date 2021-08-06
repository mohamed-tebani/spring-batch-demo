package com.example.springbatch.batch;

import com.example.springbatch.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) {
        student.setFirstName(student.getFirstName().toUpperCase());
        student.setLastName(student.getLastName().toUpperCase());
        student.setCenter(student.getCenter().toUpperCase());
        student.setOrigin(student.getOrigin().toUpperCase());
        student.setMention(student.getMention().toUpperCase());
        return student;
    }
}