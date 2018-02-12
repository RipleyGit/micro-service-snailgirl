package me.seaof.menus.mapper;

import me.seaof.menus.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper{

    /**
     * 插入一个商品信息  内容可变
     * @param prod
     * @return
     */
    int insertSelective(Product prod);


    /**
     * 根据商品的ID删除商品
     * @param prodId
     */
    void deleteByPrimaryKey(String prodId);

    /**
     * 批量删除商品信息
     * @param prodIds
     */
    void deleteProducts(String[] prodIds);

    /**
     * 根据商品ID 更新商品信息 内容可选
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * 修改商品当前的状态
      * @param prod
     */
    void updateProd(Product prod);

    /**
     * 查询状态为可用的 全部商品信息
     * @return
     */
    List<Product> findAll();

    /**
     * 无状态查询 全部商品信息
     * @return
     */
    List<Product> findAllProd();

    /**
     * 根据商品ID查询 商品信息
     * @param prodId
     * @return
     */
    Product findProdById(String prodId);

    /**
     * 根据商品的状态 查询当前上架商品总数量
     * @param prodState
     * @return
     */
    int findProdCountByState(Integer prodState);

    /**
     * 根据商品的类别 查询当前上架商品总数量
     * @param prodType
     * @return
     */
    List<Product> findAllProdByType(String prodType);

    /**
     * 分页查找商品
     * @param page
     * @param prodType
     * @return
     */
    List<Product> findProductList(@Param("page") String page, @Param("prodType") String prodType);

    /**
     * 可选状态 统计商品数量
     * @param prodType
     * @return
     */
    String findProductCount(@Param("prodType") String prodType);

    /**
     * 模糊查询商品信息
     * @param search
     * @return
     */
    List<Product> findAllBySearch(@Param("search") String search);

}
