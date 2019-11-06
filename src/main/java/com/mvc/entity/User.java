package com.mvc.entity;

import lombok.Data;

/**
 * @author CJS
 * @description
 * @date 10:30 19/10/15
 */
@Data
public class User {

    private String id;
    private String username;
    private String password;
    private String token;

}
