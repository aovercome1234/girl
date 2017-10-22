package com.ls.utils;

import com.ls.domain.Result;

/**
 * Created by keke on 2017/10/19.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);

        return result;
    }



    public static Result error(Integer code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(message);
        result.setData(null);

        return result;
    }

}
