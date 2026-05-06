package com.library.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生信息VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {
    private String studentName;
    private String courseName;
    private int score;
}
