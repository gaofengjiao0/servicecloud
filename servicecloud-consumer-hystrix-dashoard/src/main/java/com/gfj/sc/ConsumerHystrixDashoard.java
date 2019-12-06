package com.gfj.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description ConsumerHystrixDashoard
 * @date 2019/12/6 11:23
 */
@SpringBootApplication
@EnableHystrixDashboard //开启图形化监控
public class ConsumerHystrixDashoard {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashoard.class,args);
    }
}
