package com.mvc.vo;

import lombok.Data;

/**
 * @author CJS
 * @description
 * @date 15:01 19/10/15
 */
@Data
public class ResultVO<T> {

    private int code;
    private String msg;
    private T data;

}
