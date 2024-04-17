package com.example.SpringBoot_OneToMany.Service;

import com.example.SpringBoot_OneToMany.Models.UserLogin;
import com.example.SpringBoot_OneToMany.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LoginUser {
    @Autowired
    private LoginRepository repository;

    public List<UserLogin> allitems()
    {
        return repository.findAll();
    }
    public UserLogin addlogin(UserLogin user)
    {
        return repository.save(user);

    }
}
