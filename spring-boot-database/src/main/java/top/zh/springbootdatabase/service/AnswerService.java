package top.zh.springbootdatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zh.springbootdatabase.repository.AnswerRepository;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public AnswerRepository getAnswerRepository() {
        return answerRepository;
    }

    // Answer-related business logic...
}