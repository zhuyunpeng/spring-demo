package com.day1.hello;

public class HelloWorld {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("hello .."+name);
	}
	
	public HelloWorld() {
		System.out.println("无参构造器初始化");
	}
	
	public HelloWorld(String name){
		System.out.println("带参构造器。。"+name);
	}
	
}
