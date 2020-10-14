package com.wxf.dao;

import com.wxf.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    User selectUserById(Integer id);
    User selectUserByIdAndPassword(@Param("id") Integer id,@Param("password") String password);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    List<User> selectUserByName(@Param("name") String name);

    /*批量删除*/
    Integer deleteByIds(Integer[] ids);
}
