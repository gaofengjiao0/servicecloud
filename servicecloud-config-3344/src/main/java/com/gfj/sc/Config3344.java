package com.gfj.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description Config3344
 * @date 2019/12/6 13:56
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344 {

    public static void main(String[] args) {
        SpringApplication.run(Config3344.class,args);
    }
}
