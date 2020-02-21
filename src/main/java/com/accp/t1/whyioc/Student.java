package com.accp.t1.whyioc;

public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		System.out.println("无参构造学生对象");
	}
	
	public void show() {
		System.out.println("姓名:"+this.name);
	}

}
