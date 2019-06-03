package com.service;

import com.dto.Role;
import com.dto.RoleDto;

import java.util.List;

public interface RoleInfoService {
    List<Role> findAllRole();

    List<Role> findRoleByCondition(RoleDto roleDto);

}
