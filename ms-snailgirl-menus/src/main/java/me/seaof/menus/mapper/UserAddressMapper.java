package me.seaof.menus.mapper;


import me.seaof.menus.pojo.UserAddress;

import java.util.List;

public interface UserAddressMapper {
    int deleteByPrimaryKey(String addId);

    void insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(String addId);

    List<UserAddress> selectByUserId(String userId);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    void insertUserAddress(UserAddress userAddress);

    void updateAddressState(String addId);
}