package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.Emp;

public class DAO 
{

	JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
 
    //Emp e=new Emp();
	public int insertData(Emp e)
	{
		
		return jt.update("insert into crud (ename,eemail,econtact,ecity) values('"+e.getEname()+"','"+e.getEemail()+"','"+e.getEcontact()+"','"+e.getEcity()+"')");
		
	}

}
