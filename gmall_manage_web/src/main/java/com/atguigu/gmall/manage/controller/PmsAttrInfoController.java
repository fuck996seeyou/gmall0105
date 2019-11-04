package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.service.PmsBaseAttrInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PmsAttrInfoController {
    //http://127.0.0.1:8081/attrInfoList?catalog3Id=2
    //通过三级类目id查询attrInfo属性
    @Reference
    PmsBaseAttrInfoService pmsBaseAttrInfoService;
    @RequestMapping("attrInfoList")
    @ResponseBody
    @CrossOrigin
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo>  pmsBaseAttrInfos= pmsBaseAttrInfoService.getattrInfoList(catalog3Id);
return pmsBaseAttrInfos;
    }
  /** // http://127.0.0.1:8888/sockjs-node/info?t=1572825561156
    @RequestMapping("sockjs-node/info")
    @ResponseBody
    @CrossOrigin
    public List<PmsBaseAttrInfo> attrInfoList(String attrName){
        List<PmsBaseAttrInfo>  pmsBaseAttrInfos= pmsBaseAttrInfoService.getattrInfoList(attrName);
        return pmsBaseAttrInfos;
    }*/

}
