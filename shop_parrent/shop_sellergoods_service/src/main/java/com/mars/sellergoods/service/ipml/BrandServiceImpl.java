package com.mars.sellergoods.service.ipml;

import com.alibaba.dubbo.config.annotation.Service;
import com.mars.pojo.Brand;
import com.mars.sellergoods.service.BrandService;
import com.mars.shop.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> listAll() {
        return brandMapper.listAll();
    }
}
