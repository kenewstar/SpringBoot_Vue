package com.kenewstar.mapper;
import com.kenewstar.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * @Author: kenewstar
 * @Description: 用户mapper接口
 * @Date:Created in 2020/5/29
 */
@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select id,username,userage from user")
    List<User> selectAllUser();

    /**
     * 插入一个用户
     * @param user 用户参数
     * @return
     */
    @Insert("insert into user(username,userage) values(#{username},#{userage})")
    int insertUser(User user);

    /**
     * 根据用户id删除用户
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    int deleteUserById(Integer id);

    /**
     * 根据用户id修改用户信息
     * @param user
     * @return
     */
    @Update("update user set username=#{username},userage=#{userage} where id=#{id}")
    int updateUserById(User user);

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    @Select("select id,username,userage from user where id=#{id}")
    User selectUserById(Integer id);
}
