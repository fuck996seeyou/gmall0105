package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UsersMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
  @Autowired
  UserService userService;
  @RequestMapping("getAllUser")
  @ResponseBody
  public List<UsersMember> getAllUser(){
    List<UsersMember> usersMember =userService.getAllUser();
    return usersMember;
  }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "helloword";
    }
}
