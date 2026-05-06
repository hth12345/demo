package com.library.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.library.demo.dto.StudentDTO;
import com.library.demo.entity.Student;
import com.library.demo.vo.PageResult;
import com.library.demo.vo.StudentVO;

import java.util.List;
public interface StudentService extends IService<Student> {
    PageResult getAllInfo(StudentDTO studentDTO);

    List<StudentVO> getScoreByName(String name);

    List<StudentVO> getNameByScore(int score);
}
