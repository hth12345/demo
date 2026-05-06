package com.library.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private int code;
    private String message;
    private T data;

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.code =200;
        result.message ="success";
        result.data =data;
        return result;
    }
    public static <T> Result<T> error(){
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMessage("error");
        return result;
    }
}
