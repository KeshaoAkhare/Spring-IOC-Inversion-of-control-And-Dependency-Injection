package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Student s = context.getBean("stud", Student.class);
		Country c = context.getBean("c", Country.class);

		System.out.println(s);
//		System.out.println(c);

	}

}
