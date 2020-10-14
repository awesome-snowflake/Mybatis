package com.wxf.dao;

import com.wxf.entity.Manager;
import org.apache.ibatis.annotations.Param;

public interface ManagerDao {
    Manager selectById(@Param("id") String id);
}
