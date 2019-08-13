package com.moonspirit.springcloud.product.mapper;

import com.moonspirit.springcloud.product.ProductApplicationTests;
import com.moonspirit.springcloud.product.bean.Category;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryMapperTest extends ProductApplicationTests {

    @Autowired
    private CategoryMapper categoryMapperMapper;

    @Test
    public void findByStatus() {
        List<Category> list = categoryMapperMapper.findByIdIn(Arrays.asList(1, 2));
        Assert.assertTrue(list.size() > 0);
    }

}
