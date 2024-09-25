package top.zh.entity;


import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentTest {
    @Resource
    private Student student;
    @Test
    void testStudent() {
        System.out.println(student);
    }
}