package com.mars.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mars.pojo.Brand;
import com.mars.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/listAll")
    public List<Brand> listBrand () {
     return   brandService.listAll();
    }
}
