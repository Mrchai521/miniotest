package com.cxf.miniotest.service;

import com.cxf.miniotest.entity.User;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/10/10
 */
public interface IUserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();
}
