package com.library.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.library.demo.entity.Student;
import com.library.demo.vo.StudentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    //List<StudentVO> getAllInfo();

    List<StudentVO> getScoreByName(String name);

    List<StudentVO> getNameByScore(int score);

    Page<StudentVO> getAllInfoByPage(Page<StudentVO> page);
}
