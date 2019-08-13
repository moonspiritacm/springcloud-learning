package com.moonspirit.springcloud.product.mapper;

import com.moonspirit.springcloud.product.bean.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    @Select("<script> select * from category where id in " +
            "<foreach collection='list' index='index' item='item' open='(' separator=',' close=')'> #{item} " +
            "</foreach> " +
            "</script>")
    List<Category> findByIdIn(List<Integer> ids);

}
