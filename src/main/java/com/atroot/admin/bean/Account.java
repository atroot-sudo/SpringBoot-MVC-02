package com.atroot.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 定义一个实体类，用于测试MyBatis的整合
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 17:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String name;
    private String sex;
}
