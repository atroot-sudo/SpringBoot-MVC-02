package com.atroot.admin.actuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * Description: 以添加组件的方式完成自定义info信息
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.18 9:15
 */
@Component
public class ExampleInfoContributor implements InfoContributor {


    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("example", Collections.singletonMap("hello","world"));
    }
}
