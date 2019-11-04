package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
  @Reference
  UserService userService;

  @RequestMapping("getAllUser")
  @ResponseBody
  public List<UmsMember> getAllUser(){
    List<UmsMember> umsMember = userService.getAllUser();
    return umsMember;
  }
  //通过地址id查询所有地址信息
  @RequestMapping("getUmsMemberReceiveAddressrByMemberId")
  @ResponseBody
  public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressrByMemberId( String memberId){
    List<UmsMemberReceiveAddress> umsMemberReceiveAddress =  userService.getUmsMemberReceiveAddressrByMemberId(memberId);
    return umsMemberReceiveAddress;
  }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "helloword";
    }
}
