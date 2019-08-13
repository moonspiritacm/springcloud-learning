package com.moonspirit.springcloud.product.service;

import com.moonspirit.springcloud.product.bean.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findByIdIn(List<Integer> ids);

}
