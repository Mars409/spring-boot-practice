package top.zh.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
//@PropertySource(name="employeeProperties",value="classpath:employee.properties", encoding="utf-8")
public class Employee {

//    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;
}
