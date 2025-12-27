package com.backendPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetInput {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String store(@RequestParam("Email") String Email,
                        @RequestParam("Password") String Password) {
        userService.sentUser(Email, Password);
        return "Success";
    }
}
