package com.example.springbatch.batch;

import com.example.springbatch.model.Student;
import com.example.springbatch.service.IStudentService;
import org.springframework.batch.item.ItemWriter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class StudentWriter implements ItemWriter<Student> {

    @Autowired
    private IStudentService studentService;

    @Override
    public void write(List<? extends Student> students) {
        students.forEach(student -> {
            log.info("Save the object {}", student);
            studentService.insertStudent(student);
        });
    }
}
