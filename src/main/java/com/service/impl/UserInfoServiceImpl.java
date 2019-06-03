package com.service.impl;

import com.dto.Role;
import com.dto.Role_User;
import com.mapper.UserInfoMapper;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import com.utils.FindByPage;
import com.utils.MD5Utils;
import com.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    //注入
    @Autowired
    UserInfoMapper userInfoMapper;


    public UserInfo select1(UserInfoVO userInfoVO) {
        UserInfo userInfo = userInfoMapper.select1(userInfoVO);
        return userInfo;
    }

    public int add(UserInfo userInfo) {
        int i =  userInfoMapper.add1(userInfo);
        return i;
    }

    public List<UserInfo> select2() {
        List<UserInfo> userInfos = userInfoMapper.select2();
        return userInfos;
    }

    public UserInfo findById(int userid) {
        UserInfo byId = userInfoMapper.select3(userid);
        return byId;
    }

    public int updateUserInfo(UserInfo userInfo) {
        int i = userInfoMapper.update1(userInfo);
        return i;
    }

    public int deleteUserInfo(int userid) {
        int i = userInfoMapper.delete1(userid);
        return i;
    }

    public List<UserInfo> selectByCondition(String username) {
        String name = username+"%";
        List<UserInfo> userInfos = userInfoMapper.select4(name);
        return userInfos;
    }

    public List<Role> findRoleById(int userid) {
        List<Role> roles = userInfoMapper.select5(userid);
        return roles;
    }

    public int deleteRoleByUserid(int userid) {
        int i = userInfoMapper.delete2(userid);
        return i;
    }

    public int addRoleByUserid(Role_User role_user) {
        System.out.println("调用add2");
        int i = userInfoMapper.add2(role_user);
        return i;
    }




    public List<UserInfo> findAllBySplit(FindByPage findByPage) {
        System.out.println("进入service");
        return userInfoMapper.findAllBySplit(findByPage);
    }

    public int regUser(UserInfo userInfo) {
        userInfo.setPassword(MD5Utils.myEncode(userInfo.getPassword()));
        return userInfoMapper.regUser(userInfo);
    }
}
