package top.zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zh.entity.Student;

@RestController
public class StudentController {

    @Autowired
    private Student student;

    @GetMapping("/student")
    public Student getStudent() {
        return student;
    }
}