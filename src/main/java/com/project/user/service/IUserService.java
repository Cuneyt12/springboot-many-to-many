package com.project.user.service;

import com.project.role.AssignRole;
import com.project.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    User addUser(User user);

}
