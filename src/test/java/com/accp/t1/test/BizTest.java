package com.accp.t1.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accp.t1.biz.PersonBiz;
import com.accp.t1.whyioc.Student;

public class BizTest {
	
	@Test
	public void testAddPerson() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-biz.xml");
		PersonBiz biz=(PersonBiz)ac.getBean("biz");
		biz.addPerson();
	}
	
	
	@Test
	public void testUseStudent() {
		//读取ioc配置文件
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-ctx.xml");
		//请求组件
		Student stu=(Student)ac.getBean("mystudent");
		//use
		stu.show();
	}
}
