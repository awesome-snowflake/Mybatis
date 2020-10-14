package com.wxf.dao;

import com.wxf.entity.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    Employee selectEmployeeById(@Param("id") Integer id);
}
