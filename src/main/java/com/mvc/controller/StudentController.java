package com.mvc.controller;

import com.mvc.entity.Student;
import com.mvc.service.StudentService;
import com.mvc.utils.ResultVOUtil;
import com.mvc.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:36
 */
@Slf4j
@Controller
@CrossOrigin
@RequestMapping("/student")
@ResponseBody
public class StudentController {

    @Autowired
    private StudentService studentService;


//    @RequestMapping(value = "/toSelectAll",method = RequestMethod.GET)
//    public String toSelectAll() {
//        logger.info("进入学生信息界面");
//        return "student";
//    }

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public ResultVO findAllUser() {
        log.info("查询学生信息");
        List<Student> students = studentService.selectAll();
        return ResultVOUtil.success(students);
    }

}
