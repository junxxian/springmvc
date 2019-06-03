package com.service.impl;

import com.dto.Menu;
import com.dto.Role_Menu;
import com.mapper.MenuInfoMapper;
import com.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<Menu> listAllMenu(int roleid) {
        return menuInfoMapper.listAllMenu(roleid);
    }

    public int addMenu(Role_Menu role_menu) {
        System.out.println("进入addMenu Service");
        return menuInfoMapper.insert1(role_menu);
    }

    public int deleteMenu(int roleid) {
        return menuInfoMapper.delete1(roleid);
    }

    public List<Menu> listMenuByUserId(int userid) {
        return menuInfoMapper.listMenuByUserId(userid);
    }
}
