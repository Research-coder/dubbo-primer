package com.example01.dao;

import com.example01.entity.User;

import java.util.List;

/**
 * @author 杨军
 * @version 1.0
 * @date 2019/07/27 0027 上午 10:49
 */
public interface Mapper {
    List<User> findAll();
}
