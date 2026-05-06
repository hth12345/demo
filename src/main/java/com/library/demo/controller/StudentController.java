package com.library.demo.controller;

import com.library.demo.dto.StudentDTO;
import com.library.demo.service.StudentService;
import com.library.demo.vo.PageResult;
import com.library.demo.vo.Result;
import com.library.demo.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 学生信息Controller
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    /**
     * 查询所有学生成绩
     * @return
     */
    @GetMapping("/getAllInfo")
    public Result<PageResult> getAllInfo(StudentDTO studentDTO){
        PageResult pageVO = studentService.getAllInfo(studentDTO);
        return Result.success(pageVO);
    }
    /**
     * 查询一个学生成绩
     */
    @GetMapping("/getScoreByName")
    public Result<List<StudentVO>> getScoreByName(@RequestParam String name){
        List<StudentVO> list = studentService.getScoreByName(name);
        return Result.success(list);
    }
    /**
     * 查询数学成绩大于80分的学生姓名
     */
    @GetMapping("/getNameByScore")
    public Result<List<StudentVO>> getNameByScore(@RequestParam int score){
        List<StudentVO> list = studentService.getNameByScore(score);
        return Result.success(list);
    }
}
