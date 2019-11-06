package com.mvc.utils;

import com.mvc.vo.ResultVO;
import lombok.Data;

/**
 * @author CJS
 * @description
 * @date 15:01 19/10/15
 */
@Data
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO error(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(500);
        resultVO.setMsg(msg);
        resultVO.setData(null);
        return resultVO;
    }

}
