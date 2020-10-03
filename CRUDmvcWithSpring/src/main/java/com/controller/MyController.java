package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Emp;
import com.dao.DAO;

@Controller
public class MyController {
    @Autowired
	DAO d; 
	@RequestMapping("/addData")
	public String registerData()
	{
		return "view";
		
	}
	
	@RequestMapping(value = "/save",method =RequestMethod.POST)
    public String saveData(@ModelAttribute("e") Emp e)
    {
		int m=d.insertData(e);
		if(m>0)
		{
			
			return "insert";	
		}
		else
		{
			return "error";
			
		}
		
	
	
    }
	
	
}
