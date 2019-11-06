package com.mvc.aspect;

import com.mvc.exception.AuthorizeException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author CJS
 * @description
 * @date 14:46 19/10/17
 */
@Aspect
@Component
@Slf4j
public class LoginAspect {

    @Pointcut("execution(public * com.mvc.controller.*.*(..))" +
            "&& !execution(public * com.mvc.controller.UserController.*(..))")
    public void verify() {
    }

    @Before("verify()")
    public void doVerify() {
        log.info("开始验证.....");
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String token = request.getHeader("token");
        System.out.println("token:" + token);
        if("".equals(token)){
            log.info("aaa");
            throw new AuthorizeException();
        }
    }

}
