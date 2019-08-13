package com.moonspirit.springcloud.product.service.impl;

import com.moonspirit.springcloud.product.bean.Product;
import com.moonspirit.springcloud.product.enums.ProductStatusEnum;
import com.moonspirit.springcloud.product.mapper.ProductMapper;
import com.moonspirit.springcloud.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAllUpProduct() {
        return productMapper.findByStatus(ProductStatusEnum.UP.getCode());
    }

}
