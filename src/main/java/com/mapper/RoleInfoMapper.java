package com.mapper;

import com.dto.Role;
import com.dto.RoleDto;

import java.util.List;

public interface RoleInfoMapper {
    List<Role> findAllRole();

    List<Role> findRoleByCondition(RoleDto roleDto);
}
