package com.ls.exception;

import com.ls.enums.ResultEnum;

/**
 * Created by keke on 2017/10/19.
 */
public class GirlException extends RuntimeException {

    /** 异常状态码 */
    private Integer code;

    public GirlException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
