package com.gfj.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description ServiceCloudEureka7001
 * @date 2019/12/4 9:17
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceCloudEureka7001 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCloudEureka7001.class,args);
    }
}
