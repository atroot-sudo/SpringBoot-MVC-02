package com.atroot.admin.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.17 20:21
 */
@Component
public class MyComponentHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        if (1 == 2){
//            builder.up();
            builder.status(Status.UP);
            map.put("ms",100);
            map.put("count",1);
        }else{
            builder.status(Status.OUT_OF_SERVICE);
            map.put("error","timeout");
            map.put("ms",3000);
        }

        builder.withDetails(map);
        builder.withDetail("code",200);
    }
}
