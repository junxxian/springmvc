package com.dto;

import java.util.Arrays;

public class Role_User {

    private int userid;
    private int[] roleIdArr;

    public Role_User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int[] getRoleIdArr() {
        return roleIdArr;
    }

    public void setRoleIdArr(int[] roleIdArr) {
        this.roleIdArr = roleIdArr;
    }

    @Override
    public String toString() {
        return "Role_User{" +
                "userid=" + userid +
                ", roleIdArr=" + Arrays.toString(roleIdArr) +
                '}';
    }
}
