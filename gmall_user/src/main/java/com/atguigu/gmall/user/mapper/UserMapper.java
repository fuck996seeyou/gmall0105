package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UsersMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


public interface UserMapper {

    List<UsersMember> selectAllUser();
}
