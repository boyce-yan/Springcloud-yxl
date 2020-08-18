package com.yxl.cloud.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //set/get方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data; //json数据

    //自定义两个参数的构造方法
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
