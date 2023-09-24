package com.example.papermanagementsystem.mapper;

import com.example.papermanagementsystem.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author qqy20001120
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-09-24 17:43:54
* @Entity com.example.papermanagementsystem.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where username = #{text} or email = #{text}")
    User findUserByNameOrEmail(String text);
    @Insert("insert into user (username,password, email) values (#{username}, #{password}, #{email})")
    int createUser(String username, String password, String email);

}




