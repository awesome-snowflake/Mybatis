package com.wxf.dao;

import com.wxf.entity.Department;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    Department selectDepartmentById(@Param("id") Integer id);
}
