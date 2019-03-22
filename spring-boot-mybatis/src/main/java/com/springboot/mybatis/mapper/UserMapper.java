package com.springboot.mybatis.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Results({@Result(column = "user_id", property = "userId"),
            @Result(column = "mobile", property = "mobile"),
            @Result(column = "password", property = "password"),
            @Result(column = "username", property = "username"),
            @Result(column = "avatar", property = "avatar")

    })
    @Select("SELECT * FROM t_sys_user ")
    List<User> selectAll();

    @Results({@Result(column = "user_id", property = "userId"),
            @Result(column = "mobile", property = "mobile"),
            @Result(column = "password", property = "password"),
            @Result(column = "username", property = "username"),
            @Result(column = "avatar", property = "avatar")

    })
    @Select("SELECT * FROM t_sys_user WHERE user_id= #{userId} ")
    User getOne(Long userId);

    @Delete("DELETE FROM t_sys_user WHERE user_id =#{userId}")
    void delete(Long userId);

    @Insert("INSERT INTO t_sys_user(mobile,password,username,avatar)"
            + "VALUES(#{mobile},#{password},#{username},#{avatar})")
    void insert(User user);

    @Update("UPDATE t_sys_user SET avatar=#{avatar},password=#{password} WHERE user_id=#{userId}")
    void update(User user);
}
