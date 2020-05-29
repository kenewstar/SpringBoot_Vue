package com.kenewstar.pojo;

/**
 * @Author: kenewstar
 * @Description: 用户实体类
 * @Date:Created in 2020/5/29
 */
public class User {

    private Integer id;
    private String username;
    private Integer userage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
