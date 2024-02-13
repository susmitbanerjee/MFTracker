package com.example.MFTracker.base.controller;

import com.example.MFTracker.base.entity.User;
import com.example.MFTracker.base.enums.Depository;
import com.example.MFTracker.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/api/users")
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("Susmit");
        user1.setDepository(Depository.CDSL);
        User user2 = new User();
        user2.setName("Sonali");
        user2.setDepository(Depository.NDSL);
        users.add(user1);
        users.add(user2);
        return users;
    }

    public String addUser(User user){
        try {
            userService.addUser(user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "User added";
    }
}
