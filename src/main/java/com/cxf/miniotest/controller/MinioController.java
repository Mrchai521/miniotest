package com.cxf.miniotest.controller;

import com.cxf.miniotest.entity.User;
import com.cxf.miniotest.service.IUserService;
import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/10
 */
@RestController
public class MinioController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public List<User> findAllUser() {
        return iUserService.findAllUser();
    }
}
