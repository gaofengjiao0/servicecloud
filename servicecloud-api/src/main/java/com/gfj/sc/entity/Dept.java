package com.gfj.sc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc.entity
 * @description Dept
 * @date 2019/12/3 14:32
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long deptno;//主键

    private String dname;//部门名称

    private String db_source; //来自那个数据库，因为一个服务可以对应一个数据库，同一个信息存在不同的数据库中
}
