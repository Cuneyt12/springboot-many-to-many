package com.project.user.controller;

import com.project.role.AssignRole;
import com.project.user.entity.User;
import com.project.user.service.IUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService iUserService;


    public UserController(@Qualifier("userServiceImpl") IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/ekle")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return ResponseEntity.ok(iUserService.addUser(user));
    }


}
