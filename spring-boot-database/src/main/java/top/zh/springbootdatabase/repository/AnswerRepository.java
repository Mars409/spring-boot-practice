package top.zh.springbootdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zh.springbootdatabase.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
