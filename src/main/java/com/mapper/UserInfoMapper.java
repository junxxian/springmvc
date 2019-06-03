package com.mapper;

import com.dto.Role;
import com.dto.Role_User;
import com.pojo.UserInfo;
import com.utils.FindByPage;
import com.vo.UserInfoVO;

import java.util.List;

public interface UserInfoMapper {
    UserInfo select1(UserInfoVO userInfoVO);

    int add1(UserInfo userInfo);

    List<UserInfo> select2();

    UserInfo select3(int userid);

    int update1(UserInfo userInfo);

    int delete1(int userid);

    List<UserInfo> select4(String username);

    List<Role> select5(int userid);


    int delete2(int userid);

    int add2(Role_User role_user);

    List<UserInfo> findAllBySplit(FindByPage findByPage);

    int regUser(UserInfo userInfo);
}
