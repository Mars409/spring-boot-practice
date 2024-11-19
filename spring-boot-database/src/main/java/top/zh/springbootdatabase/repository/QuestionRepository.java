package top.zh.springbootdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zh.springbootdatabase.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
