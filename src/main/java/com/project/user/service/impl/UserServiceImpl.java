package com.project.user.service.impl;

import com.project.role.repository.IRoleRepository;
import com.project.role.AssignRole;
import com.project.user.entity.User;
import com.project.user.repository.IUserRepository;
import com.project.user.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final IUserRepository iUserRepository;
    private final IRoleRepository iRoleRepository;

    public UserServiceImpl(IUserRepository iUserRepository, IRoleRepository iRoleRepository) {
        this.iUserRepository = iUserRepository;
        this.iRoleRepository = iRoleRepository;
    }

    @Override
    public User addUser(User user) {
        return iUserRepository.save(user);
    }



}
