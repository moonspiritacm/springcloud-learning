package com.moonspirit.springcloud.product.mapper;

import com.moonspirit.springcloud.product.ProductApplicationTests;
import com.moonspirit.springcloud.product.bean.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapperTest extends ProductApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void findByStatus() {
        List<Product> list = productMapper.findByStatus(0);
        Assert.assertTrue(list.size() > 0);
    }

}
