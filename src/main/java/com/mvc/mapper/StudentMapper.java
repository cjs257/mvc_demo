package com.mvc.mapper;

import com.mvc.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:18
 */
public interface StudentMapper {

    /**
     * 查询所有学生
     * @param
     * @return java.util.List<com.mvc.entity.Student>
     */
    List<Student> selectAll();

}
