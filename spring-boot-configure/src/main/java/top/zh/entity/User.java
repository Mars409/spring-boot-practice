package top.zh.entity;


import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Data

public class User {
    @NotNull
    @Size(min = 2, max = 20)
    private String username;

    @NotBlank
    @Size
    private String password;

    @Email
    private String email;

    @Min(10)
    @Max(100)
    private int age;

    @Pattern(regexp = "^[0-9]{11}$")
    private String phoneNumber;

    @Future
    private LocalDate birthday;

    @Positive
    private  int score;

    @URL
    private String url;
}
