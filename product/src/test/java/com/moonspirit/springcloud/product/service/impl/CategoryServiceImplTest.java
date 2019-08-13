package com.moonspirit.springcloud.product.service.impl;

import com.moonspirit.springcloud.product.ProductApplicationTests;
import com.moonspirit.springcloud.product.bean.Category;
import com.moonspirit.springcloud.product.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByIdIn() {
        List<Category> list = categoryService.findByIdIn(Arrays.asList(1, 2));
        Assert.assertTrue(list.size() > 0);
    }

}