package com.controller;

import com.dto.FindByPageDto;
import com.dto.Role;
import com.dto.Role_User;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import com.utils.FindByPage;
import com.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


//声明这个类是一个控制器，这样它就能被扫描到
@Controller
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;


    @RequestMapping(value = "bb")
    public String test2(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo.getUsername() + ":" + userInfo.getPassword());
        int add = userInfoService.add(userInfo);
        System.out.println(add == 0 ? "注册失败" : "注册成功");
        return add == 0 ? "register" : "login";
    }


    @ResponseBody
    @RequestMapping("cc")
    public Object test3() {
        List<UserInfo> userInfos = userInfoService.select2();
        return userInfos;
    }


//--------------------------------以下为Controller项目-----------------------------------//

    //登录
    @ResponseBody
    @RequestMapping("loginController")
    public Object login(@RequestBody UserInfoVO userInfoVO, HttpSession httpSession) {
        System.out.println("username:" + userInfoVO.getUsername() + " password:" + userInfoVO.getPassword());
        UserInfo userInfo = userInfoService.select1(userInfoVO);
        System.out.println(userInfo);
        if (userInfo != null) {
            httpSession.setAttribute("UserInfo", userInfo);
        }
        return userInfo;
    }

    //登录成功后所有的用户信息
    @ResponseBody
    @RequestMapping("findAll")
    public Object listAllUserInfo() {
        return userInfoService.select2();
    }


    @Autowired
    FindByPageDto findByPageDto;
    @Autowired
    FindByPage findByPage;


    //登录成功后分页查询所有用户信息
    @ResponseBody
    @RequestMapping("findAllBySplit")
    public Object findAllBySplit(@RequestParam int page) {

        System.out.println(page);

        //统计有多少条信息
        List<UserInfo> userInfos = userInfoService.select2();
        int count = userInfos.size();
        //最大显示页数
        int maxShow = 3;

        //计算总页数
        int totalPage = count % maxShow == 0 ? count / maxShow : count / maxShow + 1;

        //获取当前页数
        int currentPage = page < 1 ? 1 : page > totalPage ? totalPage : page;

        //计算起始位置
        int start = (currentPage-1) * maxShow;


        //使用分页工具类  给分页工具设置属性
        findByPage.setmaxShow(maxShow);
        findByPage.setStart(start);



        //分页查询
        List<UserInfo> userInfos1 = userInfoService.findAllBySplit(findByPage);
        findByPageDto.setUserInfos(userInfos1);
        findByPageDto.setCurrentPage(currentPage);
        findByPageDto.setTotalPage(totalPage);

        System.out.println("最终结果："+userInfos1);

        return findByPageDto;

    }


    //根据id查找用户信息
    @ResponseBody
    @RequestMapping("findByid")
    public Object findByid(@RequestParam int userid) {
        UserInfo byId = userInfoService.findById(userid);
        return byId;
    }

    //修改用户信息
    @ResponseBody
    @RequestMapping("updateUserInfo")
    public boolean updateUserInfo(@RequestBody UserInfo userInfo) {
        int i = userInfoService.updateUserInfo(userInfo);
        System.out.println(i != 0 ? "修改成功" : "修改失败");
        return i != 0;
    }

    //删除用户信息
    @ResponseBody
    @RequestMapping("deleteUserInfo")
    public boolean deleteUserInfo(@RequestParam int userid) {
        int i = userInfoService.deleteUserInfo(userid);
        System.out.println(i != 0 ? "删除成功" : "删除失败");
        return i != 0;

    }

    //根据条件（名字）查询用户信息
    @ResponseBody
    @RequestMapping("selectByCondition")
    public Object selectByCondition(@RequestParam String username) {
        System.out.println(username);
        List<UserInfo> userInfos = userInfoService.selectByCondition(username);
        return userInfos;
    }

    //添加用户信息
    @ResponseBody
    @RequestMapping("addUserInfo")
    public boolean addUserInfo(@RequestBody UserInfo userInfo) {
        int add = userInfoService.add(userInfo);
        System.out.println(add != 0 ? "添加成功" : "添加失败");
        return add != 0;
    }

    //根据用户id查询所有Role
    @ResponseBody
    @RequestMapping("findRoleById")
    public Object findRoleById(@RequestParam int userid) {
        List<Role> roles = userInfoService.findRoleById(userid);
        System.out.println(roles);
        return roles;
    }

    //根据用户id动态修改role
    @ResponseBody
    @RequestMapping("updateUser_Role")
    public Object updateUser_Role(@RequestBody Role_User role_user) {

        System.out.println(role_user);

        //先删除该userid下的所有role
        int i = userInfoService.deleteRoleByUserid(role_user.getUserid());
        System.out.println(i != 0 ? "成功删除该用户的所有角色" : "删除该用户角色失败");
        //后添加修改后的所有role
        int j = userInfoService.addRoleByUserid(role_user);
        System.out.println(j);
        System.out.println(j != 0 ? "成功添加该用户的所有角色" : "添加该用户角色失败");
        return j != 0;
    }

    //注册
    @ResponseBody
    @RequestMapping("register")
    public boolean register(@RequestBody UserInfo userInfo){

        System.out.println(userInfo);

        int i = userInfoService.regUser(userInfo);
        System.out.println(i!=0?"注册成功":"注册失败");
        return i!=0;
    }

}
