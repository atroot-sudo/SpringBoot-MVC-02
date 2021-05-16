package com.atroot.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.7 9:21
 */
@Data
//@TableName("user_table")
public class User {
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
