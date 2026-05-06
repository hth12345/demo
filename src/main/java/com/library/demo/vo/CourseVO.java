package com.library.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课程信息VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseVO {
    private int id;
    private String name;
    private int teacherId;
}
