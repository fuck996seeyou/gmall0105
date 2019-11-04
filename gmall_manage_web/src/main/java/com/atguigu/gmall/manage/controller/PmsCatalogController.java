package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.service.PmsBaseCatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller//一级目录
class PmsCatalogController {
    @Reference
    PmsBaseCatalogService pmsBaseCatalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    @CrossOrigin
public  List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> pmsBaseCatalog1s   = pmsBaseCatalogService.getPmsCatalog1();

    return pmsBaseCatalog1s;
}
//getCatalog2二级目录
@RequestMapping("getCatalog2")
@ResponseBody
@CrossOrigin
public  List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
    List<PmsBaseCatalog2> pmsBaseCatalog2s   = pmsBaseCatalogService.getPmsCatalog2(catalog1Id);

    return pmsBaseCatalog2s;
}
//三级目录http://127.0.0.1:8081/getCatalog3?catalog2Id=2

    @RequestMapping("getCatalog3")
    @ResponseBody
    @CrossOrigin
    public  List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s   = pmsBaseCatalogService.getPmsCatalog3(catalog2Id);

        return pmsBaseCatalog3s;
    }
}
