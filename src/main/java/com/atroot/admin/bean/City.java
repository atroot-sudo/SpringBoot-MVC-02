package com.atroot.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: City实体类用于测试全注解方式
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 21:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
