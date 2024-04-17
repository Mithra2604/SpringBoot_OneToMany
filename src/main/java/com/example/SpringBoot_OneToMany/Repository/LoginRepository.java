package com.example.SpringBoot_OneToMany.Repository;

import com.example.SpringBoot_OneToMany.Models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin,Integer> {
}
