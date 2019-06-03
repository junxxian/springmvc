package com.service.impl;

import com.dto.Role;
import com.dto.RoleDto;
import com.mapper.RoleInfoMapper;
import com.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    public List<Role> findAllRole() {
        return roleInfoMapper.findAllRole();
    }

    public List<Role> findRoleByCondition(RoleDto roleDto) {
        System.out.println("进入service");
        return roleInfoMapper.findRoleByCondition(roleDto);
    }
}
