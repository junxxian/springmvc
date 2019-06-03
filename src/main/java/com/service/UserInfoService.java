package com.service;

import com.dto.Role;
import com.dto.Role_User;
import com.pojo.UserInfo;
import com.utils.FindByPage;
import com.vo.UserInfoVO;

import java.util.List;

public interface UserInfoService {

     UserInfo select1(UserInfoVO userInfoVO);

     int add(UserInfo userInfo);

     List<UserInfo> select2();

     UserInfo findById(int userid);

     int updateUserInfo(UserInfo userInfo);

     int deleteUserInfo(int userid);

     List<UserInfo> selectByCondition(String username);

    List<Role> findRoleById(int userid);

     int deleteRoleByUserid(int userid);

     int addRoleByUserid(Role_User role_user);

    List<UserInfo> findAllBySplit(FindByPage findByPage);

    int regUser(UserInfo userInfo);

}
