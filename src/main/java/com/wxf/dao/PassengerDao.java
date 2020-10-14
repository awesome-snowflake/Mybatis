package com.wxf.dao;

import com.wxf.entity.Passenger;
import org.apache.ibatis.annotations.Param;

public interface PassengerDao {
    Passenger selectPassengerById(@Param("id") Integer id);
}
