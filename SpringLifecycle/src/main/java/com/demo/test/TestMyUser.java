package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestMyUser {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	MyUser u1=(MyUser)ctx.getBean(MyUser.class);
	System.out.println(u1);
	System.out.println("before close");
	((ClassPathXmlApplicationContext)ctx).close();

	}

}
