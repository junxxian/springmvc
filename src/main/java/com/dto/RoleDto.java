package com.dto;

public class RoleDto {

    private String rolename;
    private String shortname;


    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "rolename='" + rolename + '\'' +
                ", shortname='" + shortname + '\'' +
                '}';
    }
}
