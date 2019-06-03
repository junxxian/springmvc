package com.service;

import com.dto.Menu;
import com.dto.Role_Menu;

import java.util.List;

public interface MenuInfoService {
    List<Menu> listAllMenu(int roleid);

    int addMenu(Role_Menu role_menu);

    int deleteMenu(int roleid);

    List<Menu> listMenuByUserId(int userid);
}
