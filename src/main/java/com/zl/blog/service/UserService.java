package com.zl.blog.service;

import com.zl.blog.domain.UserDto;
import com.zl.blog.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    Map<String,Object> signIn(UserDto userDto);



//   List<User> getUsers();
}
