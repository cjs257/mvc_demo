package com.mvc.controller;

import com.mvc.entity.User;
import com.mvc.service.UserService;
import com.mvc.utils.ResultVOUtil;
import com.mvc.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:36
 */
@Slf4j
@Controller
@CrossOrigin
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultVO login(User user, HttpServletResponse response) {
        log.info("获取的数据" + user);
        log.info("开始登录验证");
        User loginUser = userService.findUser(user);
        System.out.println(loginUser);
        if (loginUser != null) {
            // 保存token到Header
            String token = UUID.randomUUID().toString();
            response.addHeader("token", token);
            response.setHeader("Access-Control-Expose-Headers", "token");
            return ResultVOUtil.success(loginUser);
        }
        return ResultVOUtil.error("失败");
    }

//    @RequestMapping(value = "/logOut", method = RequestMethod.GET)
//    public String logOut(HttpServletRequest request) {
//        logger.info("退出成功");
//        request.getSession().invalidate();
//        return "login";
//    }

}
