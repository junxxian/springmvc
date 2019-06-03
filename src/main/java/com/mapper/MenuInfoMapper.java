package com.mapper;

import com.dto.Menu;
import com.dto.Role_Menu;

import java.util.List;

public interface MenuInfoMapper {
    List<Menu> listAllMenu(int roleid);

    int delete1(int roleid);

    int insert1(Role_Menu role_menu);

    List<Menu> listMenuByUserId(int userid);
}
