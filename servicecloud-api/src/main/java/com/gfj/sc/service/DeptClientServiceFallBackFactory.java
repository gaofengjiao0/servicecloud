package com.gfj.sc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.gfj.sc.entity.Dept;
import feign.hystrix.FallbackFactory;
/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc.service
 * @description DeptClientServiceFallBackFactory
 * @date 2019/12/6 9:21
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                List<Dept> res = new ArrayList<>();
                res.add(new Dept().setDname("服务降级").setDb_source("info"));
                return res;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
