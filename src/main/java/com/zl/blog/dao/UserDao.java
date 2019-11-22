package com.zl.blog.dao;

import com.zl.blog.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zheng
 * @ClassName UserDao
 * @Description UserDao数据访问对象接口
 * @Date    2019/11/9
 * @Version 1.0
 **/

public interface UserDao {
    int[] batchInsert(List<User> studentList) throws SQLException;
    User findUserByMobile(String mobile) throws SQLException;

//    List<User> selectHotUsers() throws SQLException;
}
