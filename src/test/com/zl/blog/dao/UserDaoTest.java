package com.zl.blog.dao;

import com.zl.blog.factory.DaoFactory;
import com.zl.blog.util.JSoupSpider;
import com.zl.blog.dao.UserDao;
import com.zl.blog.factory.DaoFactory;
import org.slf4j.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserDaoTest {
    private static Logger logger = (Logger) LoggerFactory.getLogger(UserDaoTest.class);
    private UserDao userDao = DaoFactory.getUserDaoInstance();
    @Test
    public void batchInsert() {
        try {
            int[] result = userDao.batchInsert(JSoupSpider.getUsers());
        } catch (SQLException e) {
            logger.error("批量新增用户出现异常");
        }
    }
}