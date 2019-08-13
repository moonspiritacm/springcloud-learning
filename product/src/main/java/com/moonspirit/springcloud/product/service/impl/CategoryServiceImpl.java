package com.moonspirit.springcloud.product.service.impl;

import com.moonspirit.springcloud.product.bean.Category;
import com.moonspirit.springcloud.product.mapper.CategoryMapper;
import com.moonspirit.springcloud.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findByIdIn(List<Integer> ids) {
        return categoryMapper.findByIdIn(ids);
    }

}
