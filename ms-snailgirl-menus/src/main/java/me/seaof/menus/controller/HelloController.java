package me.seaof.menus.controller;

import com.alibaba.fastjson.JSON;
import me.seaof.menus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private ProductService productService;


    @RequestMapping("index")
    public String hello(){
        System.out.printf(String.valueOf(productService.findProdCount()));
        return JSON.toJSONString(productService.findProdById("10"));
    }
}