package com.zl.blog.service.impl;

import com.zl.blog.dao.UserDao;
import com.zl.blog.domain.UserDto;
import com.zl.blog.entity.User;
import com.zl.blog.factory.DaoFactory;
import com.zl.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class UserServiceImpl implements UserService {
    private UserDao userDao = DaoFactory.getUserDaoInstance();
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public Map<String, Object> signIn(UserDto userDto) {
        User user = null;
        Map<String, Object> map = new HashMap<>();
        try {
            user = userDao.findUserByMobile(userDto.getMobile());
        } catch (SQLException e) {
            logger.error("根据手机号查询用户出现异常");
        }
        if (user != null) {
            if (user.getPassword().equals(userDto.getPassword())) {
                map.put("msg", "登录成功");
                map.put("data", user);
            } else {
                map.put("msg", "密码错误");
            }
        } else {
            map.put("msg", "手机号不存在");
        }
        return map;
    }
}