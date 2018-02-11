package me.seaof.menus.mapper;


import me.seaof.menus.pojo.ProdUpdate;

public interface ProdUpdateMapper {
    int insert(ProdUpdate record);

    int insertSelective(ProdUpdate record);
}