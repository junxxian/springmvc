package com.controller;

import com.dto.Role;
import com.dto.RoleDto;
import com.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleInfoController {
    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping("findAllRole")
    public Object findAllRole(){
       List<Role> roles =  roleInfoService.findAllRole();
       return roles;
    }

    @RequestMapping("findRoleByCondition")
    public Object findRoleByCondition(@RequestBody RoleDto roleDto){
        System.out.println(roleDto.getRolename());
        System.out.println(roleDto.getShortname());
        List<Role> roles = roleInfoService.findRoleByCondition(roleDto);
        return roles;
    }

}
