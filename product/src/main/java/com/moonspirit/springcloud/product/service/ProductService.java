package com.moonspirit.springcloud.product.service;

import com.moonspirit.springcloud.product.bean.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllUpProduct();

}
