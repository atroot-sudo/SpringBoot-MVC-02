package com.atroot.admin.service;

import com.atroot.admin.bean.Account;
import com.atroot.admin.bean.User;
import com.atroot.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: Service调用
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 17:08
 */
@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAccountById(int id) {
        return accountMapper.getAccountById(id);
    }
}
