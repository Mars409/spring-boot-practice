package top.zh.controller;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zh.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public String createUser(@RequestBody @Valid User user) {return "用户有效！";

    }
}

