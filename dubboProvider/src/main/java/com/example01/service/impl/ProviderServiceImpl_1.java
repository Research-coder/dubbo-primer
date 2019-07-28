package com.example01.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example01.dao.Mapper;
import com.example01.entity.User;
import com.example01.service.ProviderService_1;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 杨军
 * @version 1.0
 * @date 2019/07/26 0026 下午 07:49
 */
@Service
public class ProviderServiceImpl_1 implements ProviderService_1 {

    @Autowired
    private Mapper mapper;

    public String firstMethod() {
        return "可行";
    }

    @Override
    public List<User> findAll() {
        List<User> list = mapper.findAll();
        return list;
    }
}
