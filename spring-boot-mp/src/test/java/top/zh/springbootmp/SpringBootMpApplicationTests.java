package top.zh.springbootmp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMpApplicationTests {

    @Test
    void contextLoads() {
    }
    public class Application {
        public static void main(String[] args){
            SpringApplication.run(Application.class,args);
        }
    }
}