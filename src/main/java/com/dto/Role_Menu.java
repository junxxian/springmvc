package com.dto;

import java.util.Arrays;

public class Role_Menu {
    private int roleid;
    private int[] menuids;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int[] getMenuids() {
        return menuids;
    }

    public void setMenuids(int[] menuids) {
        this.menuids = menuids;
    }

    @Override
    public String toString() {
        return "Role_Menu{" +
                "roleid=" + roleid +
                ", menuids=" + Arrays.toString(menuids) +
                '}';
    }
}
