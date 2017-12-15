package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class ClientApp_Autowiring_oneMatch {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
		ApplicationContext ctx=new ClassPathXmlApplicationContext(
				"com/app/cfg/Springconfig_Autowiring_OneMatch.xml");
		Employee e=(Employee)ctx.getBean("emp");
			System.out.println(e);
	}

}
