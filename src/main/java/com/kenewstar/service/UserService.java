package com.kenewstar.service;

import com.kenewstar.pojo.User;

import java.util.List;

/**
 * @Author: kenewstar
 * @Description: 用户业务逻辑层
 * @Date:Created in 2020/5/29
 */
public interface UserService {
    /**
     * 显示所有用户
     * @return
     */
    List<User> showAllUser();

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 根据用户id删除用户
     * @param id
     * @return
     */
    int removeUserById(Integer id);

    /**
     * 根据用户id修改用户信息
     * @param user
     * @return
     */
    int modifyUserById(User user);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectUserById(Integer id);

}
