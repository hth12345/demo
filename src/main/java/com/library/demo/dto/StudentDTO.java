package com.library.demo.dto;

import com.library.demo.vo.StudentVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private int pageNo;
    private int pageSize;
    private long total;
    private List<StudentVO> list;
}
