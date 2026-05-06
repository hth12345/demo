package com.library.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")

public class User {
    private int id;
    private String name;
    private int age;
    private String email;
}
