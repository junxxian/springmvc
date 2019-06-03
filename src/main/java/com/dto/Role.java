package com.dto;

public class Role {
    private int roleid;
    private String rolename;
    private String shortname;
    private int isnull;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

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

    public int getIsnull() {
        return isnull;
    }

    public void setIsnull(int isnull) {
        this.isnull = isnull;
    }

    @Override
    public String toString() {
        return "dto{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", shortname='" + shortname + '\'' +
                ", isnull=" + isnull +
                '}';
    }
}
