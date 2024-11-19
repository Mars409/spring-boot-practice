package top.zh.springbootdatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zh.springbootdatabase.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public QuestionRepository getQuestionRepository() {
        return questionRepository;
    }

    // Question-related business logic...
}
