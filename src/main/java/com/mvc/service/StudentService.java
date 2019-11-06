package com.mvc.service;

import com.mvc.entity.Student;

import java.util.List;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:31
 */
public interface StudentService {

    /**
     * 所有学生
     * @param
     * @return java.util.List<com.mvc.entity.Student>
     */
    List<Student> selectAll();

}
