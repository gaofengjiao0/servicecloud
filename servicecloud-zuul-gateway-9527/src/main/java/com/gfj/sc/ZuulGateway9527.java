package com.gfj.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description ZuulGateway9527
 * @date 2019/12/6 12:37
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527.class,args);
    }
}
