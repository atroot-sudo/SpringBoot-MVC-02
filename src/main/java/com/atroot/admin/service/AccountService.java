package com.atroot.admin.service;

import com.atroot.admin.bean.Account;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.16 11:33
 */

public interface AccountService {
    public Account getAccountById(int id);
}
