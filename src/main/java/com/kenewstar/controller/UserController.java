package com.kenewstar.controller;

import com.kenewstar.pojo.ResponseCode;
import com.kenewstar.pojo.User;
import com.kenewstar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kenewstar
 * @Description:
 * @Date:Created in 2020/5/29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    private ResponseCode respCode;

    @RequestMapping("/showAllUser")
    public List<User> showAllUser(){
        List<User> list = this.userService.showAllUser();
        return list;
    }
    @RequestMapping("/addUser")
    public ResponseCode addUser(@RequestBody User user){
        int i = this.userService.addUser(user);
        List<User> list = this.userService.showAllUser();
        if (i>0){
            //插入成功
            respCode = new ResponseCode(200,list);
            return respCode;
        }else {
            respCode = new ResponseCode(400,list);
            return respCode;
        }
    }
    @RequestMapping("/removeUserById")
    public ResponseCode removeUserById(Integer id){
        int i = this.userService.removeUserById(id);
        List<User> list = this.userService.showAllUser();
        if (i>0){
            //删除成功
            respCode = new ResponseCode(200,list);
            return respCode;
        }else {
            respCode = new ResponseCode(400,list);
            return respCode;
        }
    }
    @RequestMapping("/modifyUserById")
    public ResponseCode modifyUserById(@RequestBody User user){
        int i = this.userService.modifyUserById(user);
        List<User> list = this.userService.showAllUser();
        System.out.println(user.getId()+user.getUsername()+user.getUserage());
        if (i>0){
            //修改成功
            respCode = new ResponseCode(200,list);
            return respCode;
        }else {
            respCode = new ResponseCode(400,list);
            return respCode;
        }
    }
    @RequestMapping("/selectUserById")
    public User selectUserById(Integer id){
        User user = this.userService.selectUserById(id);
        return user;
    }

}
