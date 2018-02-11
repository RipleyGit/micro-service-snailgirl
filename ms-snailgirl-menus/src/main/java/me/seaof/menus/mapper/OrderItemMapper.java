package me.seaof.menus.mapper;

import me.seaof.menus.pojo.OrderItem;
import me.seaof.menus.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
public interface OrderItemMapper {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectOrderItemListByOrderId(String orderId);

    void insertItem(Map<Product, String> prods, @Param("orderId") String orderId);

    List<OrderItem> findOrderItemsById(String orderId);

    void deleteOrderItemsByOrderId(String[] orderIds);
}