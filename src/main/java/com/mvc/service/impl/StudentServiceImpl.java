package com.mvc.service.impl;

import com.mvc.entity.Student;
import com.mvc.mapper.StudentMapper;
import com.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:33
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * @param
     * @return java.util.List<com.mvc.entity.Student>
     * @author CJS
     * @description
     * @date 10:22 19/10/14
     */
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
