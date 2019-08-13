package com.moonspirit.springcloud.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public  findAllArticles(@RequestParam(defaultValue = "1") int pageNum,
//                                          @RequestParam(defaultValue = "10") int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        return articleService.findAllArticles();
//    }
}
