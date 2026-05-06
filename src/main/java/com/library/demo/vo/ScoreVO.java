package com.library.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 成绩信息VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreVO {
    private int studentId;
    private int courseId;
    private int score;
}
