package com.library.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.library.demo.entity.User;

import java.util.List;

/**
 * 用户信息Service
 */
public interface UserService extends IService<User> {

    List<User> selectByAge(int age);
}
