package com.gfj.sc.controller;

import com.gfj.sc.entity.Dept;
import com.gfj.sc.service.DeptClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController_Consumer {

	@Resource
	private DeptClientService deptClientService;


	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept)
	{
		return deptClientService.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return deptClientService.get(id);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list()
	{
		return deptClientService.list();
	}

}
