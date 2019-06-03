package com.utils;


import org.springframework.stereotype.Component;

@Component
public class FindByPage {
    // 每页显示的数据
    int maxShow;
    // 总页数
    int totalPage;
    // 当前页
    int currentPage;
    // 起始位置
    int start;
    // 数据量
    int total;


    public int getmaxShow() {
        return maxShow;
    }

    public void setmaxShow(int maxShow) {
        this.maxShow = maxShow;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "FindByPage{" +
                "maxShow=" + maxShow +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", start=" + start +
                ", total=" + total +
                '}';
    }
}
