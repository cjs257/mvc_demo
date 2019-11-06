package com.mvc.handler;

import com.mvc.exception.AuthorizeException;
import com.mvc.utils.ResultVOUtil;
import com.mvc.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author CJS
 * @description
 * @date 16:16 19/10/17
 */
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = AuthorizeException.class)
    public ResultVO handlerAuthorizeException(){
        return ResultVOUtil.error("您还未登录");
    }

}
