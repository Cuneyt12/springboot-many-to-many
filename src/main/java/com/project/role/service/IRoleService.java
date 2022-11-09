package com.project.role.service;

import com.project.role.AssignRole;
import com.project.role.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {
    Role addRole(Role role);
    String assignRole(AssignRole assignRole);
    List<Role> listele();
}
