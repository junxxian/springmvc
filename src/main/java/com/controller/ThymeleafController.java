package com.controller;


import com.pojo.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThymeleafController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("TestThymeleaf")
    public ModelAndView test1(ModelAndView map){

        //1.ModelAndView必须设置viewName（往哪跳）
        map.setViewName("thymeleaf");

        List<UserInfo> userInfos = userInfoService.select2();
        map.addObject("userInfos",userInfos);
        return map;
    }
}
