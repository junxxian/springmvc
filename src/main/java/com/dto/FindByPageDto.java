package com.dto;

import com.pojo.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//分页查询返回的对象
public class FindByPageDto {

    private int currentPage;
    private int totalPage;
    private List<UserInfo> userInfos;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public String toString() {
        return "FindByPageDto{" +
                "currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", userInfos=" + userInfos +
                '}';
    }
}
