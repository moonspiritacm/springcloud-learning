package com.moonspirit.springcloud.product.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Product {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Integer stock;

    private String description;

    private String icon;

    private Integer status;

    private Integer categoryId;

    private Date createTime;

    private Date updateTime;

}
