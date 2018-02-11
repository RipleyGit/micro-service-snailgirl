package me.seaof.menus.mapper;


import me.seaof.menus.pojo.Favor;

import java.util.List;


public interface FavorMapper {

    List<Favor> findFavorList(String userId);
}
