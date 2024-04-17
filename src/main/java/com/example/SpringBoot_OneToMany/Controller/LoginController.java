package com.example.SpringBoot_OneToMany.Controller;

import com.example.SpringBoot_OneToMany.Models.UserLogin;
import com.example.SpringBoot_OneToMany.Service.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginUser service;

    @GetMapping("/allitems")
    public List<UserLogin> allitems() {
        return service.allitems();
    }

    @PostMapping("/addlogin")
    public UserLogin addlogin(@RequestBody UserLogin user) {
        return service.addlogin(user);
    }
}
