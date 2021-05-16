package com.atroot.admin;

import com.atroot.admin.bean.User;
import com.atroot.admin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
@Slf4j
class SpringBootMvc02ApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        String sql = "select count(*) from user";
//        List<User> users = jdbcTemplate.queryForList(sql, User.class);
//        System.out.println(users);
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        log.info("数据库的记录条数为：{}",integer);
    }

//    @Test
//    void findById(){
//        User user = userMapper.selectById(2L);
//        log.info("用户信息：{}",user);
//    }
}
