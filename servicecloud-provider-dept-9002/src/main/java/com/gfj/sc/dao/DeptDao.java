package com.gfj.sc.dao;

import com.gfj.sc.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gfj
 * @version v1.0
 * @package com.gfj.sc.dao
 * @description DeptDao
 * @date 2019/12/3 15:12
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
