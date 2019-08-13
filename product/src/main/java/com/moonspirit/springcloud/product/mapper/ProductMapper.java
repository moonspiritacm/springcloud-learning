package com.moonspirit.springcloud.product.mapper;

import com.moonspirit.springcloud.product.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    @Select("select * from product where status=#{status}")
    List<Product> findByStatus(int status);

}
