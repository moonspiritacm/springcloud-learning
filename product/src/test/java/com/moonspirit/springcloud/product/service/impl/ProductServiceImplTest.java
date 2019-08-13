package com.moonspirit.springcloud.product.service.impl;

import com.moonspirit.springcloud.product.ProductApplicationTests;
import com.moonspirit.springcloud.product.bean.Product;
import com.moonspirit.springcloud.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findAllUpProduct() {
        List<Product> list = productService.findAllUpProduct();
        Assert.assertTrue(list.size() > 0);
    }
}