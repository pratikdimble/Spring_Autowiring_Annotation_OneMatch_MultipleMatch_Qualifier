package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.app.beans.Employee_Qualifier;

public class ClientApp_Autowiring_Qualifier {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
		ApplicationContext ctx=new ClassPathXmlApplicationContext(
				"com/app/cfg/Springconfig_Autowiring_Qualifier.xml");
		Employee_Qualifier e=(Employee_Qualifier)ctx.getBean("emp");
			System.out.println(e);
	}

}
