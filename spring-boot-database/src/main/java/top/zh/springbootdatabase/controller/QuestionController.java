package top.zh.springbootdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zh.springbootdatabase.entity.Question;
import top.zh.springbootdatabase.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/create")
    public Question createQuestion(@RequestBody Question question) {
        // Create question logic...
        return question;
    }

    // Other question-related endpoints...
}
