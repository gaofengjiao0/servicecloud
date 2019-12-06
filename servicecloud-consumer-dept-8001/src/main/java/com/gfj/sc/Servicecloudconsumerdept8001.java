package com.gfj.sc;

import com.gfj.myselfrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc
 * @description servicecloudconsumerdept8002
 * @date 2019/12/3 16:35
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SERVICECLOUD-DEPT",configuration = MySelfRule.class)    //自定义负载均衡规则
public class Servicecloudconsumerdept8001 {
    public static void main(String[] args) {
        SpringApplication.run(Servicecloudconsumerdept8001.class,args);
    }
}
