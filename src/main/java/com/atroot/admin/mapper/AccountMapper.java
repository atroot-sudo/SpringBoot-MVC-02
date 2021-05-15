package com.atroot.admin.mapper;

import com.atroot.admin.bean.Account;
import com.atroot.admin.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: 定义操作数据库的AccountMapper接口
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 16:39
 */
@Mapper
public interface AccountMapper {
    /**
    *Description: 通过Id查询一个User
    *@Param [id]
    *@return com.atroot.admin.bean.User
    */
    public Account getAccountById(int id);
}
