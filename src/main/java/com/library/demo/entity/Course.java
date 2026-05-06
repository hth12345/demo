package com.library.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课程信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("course")
public class Course {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    @TableField("course_name")
    private String name;
    private int teacherId;
}
