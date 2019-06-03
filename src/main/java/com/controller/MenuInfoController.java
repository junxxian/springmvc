package com.controller;

import com.dto.Menu;
import com.dto.Role_Menu;
import com.pojo.UserInfo;
import com.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class MenuInfoController {

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("listAllMenu")
    public Object listAllMenu(@RequestParam int roleid){

        List<Menu> menus = menuInfoService.listAllMenu(roleid);
        System.out.println(menus);
        return menus;
    }

    @RequestMapping("updateMenu")
    public boolean updateMenu(@RequestBody Role_Menu role_menu){

        //先删除
        int i = menuInfoService.deleteMenu(role_menu.getRoleid());

        //后添加
        int[] menuids = role_menu.getMenuids();
        int j=0;
        if (menuids.length>0){
             j = menuInfoService.addMenu(role_menu);
        }
        return j!=0 || i!=0;
    }

    @RequestMapping("listMenuByUserId")
    public List<Menu> listMenuByUserId(HttpSession httpSession){
        UserInfo userInfo = (UserInfo) httpSession.getAttribute("UserInfo");

        System.out.println(userInfo.getUserid());
        int userid = userInfo.getUserid();
        List<Menu> menus = menuInfoService.listMenuByUserId(userid);
        System.out.println(menus);
        return menus;
    }
}
