package com.project.role.service.impl;

import com.project.role.AssignRole;
import com.project.role.entity.Role;
import com.project.role.repository.IRoleRepository;
import com.project.role.service.IRoleService;
import com.project.user.entity.User;
import com.project.user.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    private final IRoleRepository iRoleRepository;
    private final IUserRepository iUserRepository;

    public RoleServiceImpl(IRoleRepository iRoleRepository, IUserRepository iUserRepository) {
        this.iRoleRepository = iRoleRepository;
        this.iUserRepository = iUserRepository;
    }

    @Override
    public Role addRole(Role role) {
        return iRoleRepository.save(role);
    }

    @Override
    public String assignRole(AssignRole assignRole) {
        User user = iUserRepository.findUserByUserId(assignRole.getUserId());
        Role role = iRoleRepository.findRoleByRoleName(assignRole.getRoleName());

        role.getUsers().add(user);

        iUserRepository.save(user);
        return "Kayıt eklendi";
    }

    @Override
    public List<Role> listele() {
        return iRoleRepository.findAll();
    }
}
