package com.atroot.admin.service.impl;

import com.atroot.admin.bean.User;
import com.atroot.admin.mapper.UserMapper;
import com.atroot.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.16 11:38
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
