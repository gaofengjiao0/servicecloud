package com.gfj.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description servicecloudconsumerdept8002
 * @date 2019/12/3 16:35
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gfj.sc"})
@ComponentScan("com.gfj.sc")
public class ServicecloudconsumerdeptFeign8001 {
    public static void main(String[] args) {
        SpringApplication.run(ServicecloudconsumerdeptFeign8001.class,args);
    }
}
