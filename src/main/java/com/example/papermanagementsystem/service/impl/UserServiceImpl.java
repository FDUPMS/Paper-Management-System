package com.example.papermanagementsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.papermanagementsystem.pojo.User;
import com.example.papermanagementsystem.service.UserService;
import com.example.papermanagementsystem.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author qqy20001120
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-09-24 17:43:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




