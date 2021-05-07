package com.atroot.admin.bean;

import lombok.*;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.7 9:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private String userName;
    private String password;
}
