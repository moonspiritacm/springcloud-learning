package com.moonspirit.springcloud.product.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Category {

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
