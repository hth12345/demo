package com.library.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.library.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectByAge(int age);
}
