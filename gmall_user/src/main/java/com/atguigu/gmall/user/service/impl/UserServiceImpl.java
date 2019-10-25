package com.atguigu.gmall.user.service.impl;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;

import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl<listumsMemberReceiveAddress> implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> usersMenberList = userMapper.selectAll();//userMapper.selectAllUser();
        return usersMenberList;
    }

    @Override//通过MemberId查询UmsMemberReceiveAddress表数据
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressrByMemberId(String memberId){
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> listumsMemberReceiveAddress= umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        //umsMemberReceiveAddressMapper.selectUmsMemberReceiveAddressrByMemberId(memberId);
        return listumsMemberReceiveAddress;
    }


}
