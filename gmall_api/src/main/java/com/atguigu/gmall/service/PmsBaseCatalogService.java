package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface PmsBaseCatalogService {
    List<PmsBaseCatalog1> getPmsCatalog1();

    List<PmsBaseCatalog2> getPmsCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getPmsCatalog3(String catalog2Id);
}
