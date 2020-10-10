package com.cxf.miniotest.service.impl;

import com.cxf.miniotest.entity.User;
import com.cxf.miniotest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/10/10
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAllUser() {
        List<User> users = jdbcTemplate.query("select * from \"user\"", new BeanPropertyRowMapper<>(User.class));
        return users;
    }
}
