package me.seaof.menus.mapper;


import me.seaof.menus.pojo.StockMate;

public interface StockMateMapper {
    int deleteByPrimaryKey(String mateId);

    int insert(StockMate record);

    int insertSelective(StockMate record);

    StockMate selectByPrimaryKey(String mateId);

    int updateByPrimaryKeySelective(StockMate record);

    int updateByPrimaryKey(StockMate record);
}