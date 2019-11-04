package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrInfoService {
    List<PmsBaseAttrInfo> getattrInfoList(String catalog3Id);
}
