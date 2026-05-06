package com.library.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.library.demo.dto.StudentDTO;
import com.library.demo.entity.Student;
import com.library.demo.mapper.StudentMapper;
import com.library.demo.service.StudentService;
import com.library.demo.vo.PageResult;
import com.library.demo.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生信息Service
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public PageResult getAllInfo(StudentDTO studentDTO) {
        // 设置默认分页参数
        int pageNo = studentDTO.getPageNo() <= 0 ? 1 : studentDTO.getPageNo();
        int pageSize = studentDTO.getPageSize() <= 0 ? 10 : studentDTO.getPageSize();
        
        Page<StudentVO> page = Page.of(pageNo, pageSize);
        Page<StudentVO> p = studentMapper.getAllInfoByPage(page);
        return new PageResult(p.getTotal(),p.getRecords());
    }

    @Override
    public List<StudentVO> getScoreByName(String name) {
        return studentMapper.getScoreByName(name);
    }

    @Override
    public List<StudentVO> getNameByScore(int score) {
        return studentMapper.getNameByScore(score);
    }
}
