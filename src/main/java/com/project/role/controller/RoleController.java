package com.project.role.controller;

import com.project.role.AssignRole;
import com.project.role.entity.Role;
import com.project.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final IRoleService iRoleService;

    public RoleController(@Qualifier("roleServiceImpl") IRoleService iRoleService) {
        this.iRoleService = iRoleService;
    }

    @PostMapping("/ekle")
    public ResponseEntity<Role> addRole(@RequestBody Role role){
        return ResponseEntity.ok(iRoleService.addRole(role));
    }

    @PostMapping("/assign")
    public ResponseEntity<String> assignRole(@RequestBody AssignRole assignRole){
        return ResponseEntity.ok(iRoleService.assignRole(assignRole));
    }

    @GetMapping("/listele")
    public ResponseEntity<List<Role>> listele(){
        return ResponseEntity.ok(iRoleService.listele());
    }

}
