package com.library.demo.controller;

import com.library.demo.dto.UserDTO;
import com.library.demo.entity.User;
import com.library.demo.service.UserService;
import com.library.demo.vo.Result;
import com.library.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户信息Controller
 */

@RestController

public class UserController {
    @Autowired
    private UserService userService;
    /**
     * get参数传递
     * @return
     */
    /*@RequestMapping("/getUser")
    public String getUser(@RequestParam String name){

        return name;
    }*/

    /**
     * 路径参数传递
     */
    @RequestMapping("/getUser/{name}")//要用{}占位符
    public String getUser(@PathVariable String name) {
        return name;
    }

    /**
     * json格式参数传递
     *
     * @return
     */
    @PostMapping("/postUser")
    public UserVO postUser(@RequestBody UserDTO userDTO) {
        UserVO userVO = new UserVO();
        userVO.setName(userDTO.getName());
        userVO.setAge(userDTO.getAge());
        return userVO;
    }

    /**
     * 根据姓名查询
     */
    /*@GetMapping("/selectByName")
    public UserVO selectByName(@RequestParam String name){
        UserDTO userDTO = userService.selectByName(name);
        UserVO userVO = new UserVO();
        userVO.setName(userDTO.getName());
        userVO.setAge(userDTO.getAge());
        return userVO;
    }*/
    /**
     * 根据年龄查询
     */
    @GetMapping("/selectByAge")
    public Result<List<User>> selectByAge(int age){
        List<User> list = userService.selectByAge(age);
        return Result.success(list);
    }
}
