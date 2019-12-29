package com.mmall.dao;

import com.mmall.pojo.Shipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    int deleteByShippingIdUserId(@Param("userId")Integer userId,@Param("shipingId") Integer shippingId);

    int updateByShipping(Shipping record);

    Shipping selectByShippingByUserId(@Param("userId")Integer userId,@Param("shipingId") Integer shippingId);

    List<Shipping> selectByUserId(@Param("userId") Integer userId);
}