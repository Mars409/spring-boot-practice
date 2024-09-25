package top.zh.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {

    private String name;
    private int age;

}