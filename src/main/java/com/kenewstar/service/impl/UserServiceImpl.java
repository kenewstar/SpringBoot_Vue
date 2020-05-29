package com.kenewstar.service.impl;

import com.kenewstar.mapper.UserMapper;
import com.kenewstar.pojo.User;
import com.kenewstar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: kenewstar
 * @Description:
 * @Date:Created in 2020/5/29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> showAllUser() {
        return this.userMapper.selectAllUser();
    }

    @Override
    public int addUser(User user) {
        return this.userMapper.insertUser(user);
    }

    @Override
    public int removeUserById(Integer id) {
        return this.userMapper.deleteUserById(id);
    }

    @Override
    public int modifyUserById(User user) {
        return this.userMapper.updateUserById(user);
    }

    @Override
    public User selectUserById(Integer id) {
        return this.userMapper.selectUserById(id);
    }
}
