package me.seaof.menus.controller;


import com.alibaba.fastjson.JSON;
import me.seaof.menus.pojo.Product;
import me.seaof.menus.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/prod")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;
    /**
     *  展示全部的商品列表
     * @return List<Product>
     */
    @GetMapping("/prodList")
    public String toProductList(){
        List<Product> allProductList = productService.findAll();
        return JSON.toJSONString(allProductList);
    }

    /**
     * 获取菜品的图片
     * @param prodImg
     * @throws IOException
     */
    @GetMapping("/prodImg/{prodImg}")
    public void getProductImage(@PathVariable("prodImg") String prodImg) {

    }

    /**
     * 根据商品id展示相关信息
     * @param prodId
     * @return
     */
    @GetMapping("/prodById/{prodId}")
    public String prodById(@PathVariable("prodId") String prodId){
        Product prod=productService.findProdById(prodId);

        return JSON.toJSONString(prod);
    }
    /**
     * 模糊查询
     * @param search
     * @return
     */
    @RequestMapping("/prodListBySearch")
    @GetMapping("/prodListBySearch/{search}")
    public String ProdListBySearchAction(@PathVariable("search") String search) {
        //2.调用service层的方法查询指定的商品
        List<Product> list = productService.findAllBySearch(search);

        //如果没有找到商品，跳转到NotFound页面
        if(list.size()==0){
            return "/front/NotFoundProd";
        }
        //3.将所有商品的集合存入request域 并转发带prod_list页面

        return "/front/popular-Restaurents";
    }



}
