package com.gfj.myselfrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gfj
 * @version v1.0
 * @package myselfrule
 * @description MySelfRule自定义负载均衡规则类
 * @date 2019/12/5 13:10
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();
        return new RandomRule_ZY();
    }


}
