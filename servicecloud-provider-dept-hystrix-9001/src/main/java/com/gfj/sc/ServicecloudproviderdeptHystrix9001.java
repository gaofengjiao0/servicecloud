package com.gfj.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description servicecloudproviderdept8001APP
 * @date 2019/12/3 15:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker //对hystrix融断机制的支持
public class ServicecloudproviderdeptHystrix9001 {
    public static void main(String[] args) {
        SpringApplication.run(ServicecloudproviderdeptHystrix9001.class,args);
    }
}
