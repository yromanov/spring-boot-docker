package com.example.spring_boot_docker;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    @JsonView(User.WithPasswordView.class)
    public User getUser() {
        return new User("eric", "7!jd#h23");
    }
}
