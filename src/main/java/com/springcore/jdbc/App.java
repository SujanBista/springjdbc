package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.studentdao;
import com.springcore.jdbc.entities.student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");

		studentdao studentdao = context.getBean("studentdao", studentdao.class);

//		 this is a layout of insert() method
//		 student std = new student();
//		 
//		 std.setId(250);
//		 std.setCity("ktm");
//     	 std.setName("bk");
//		 
//		 int res = studentdao.insert(std);
//		 System.out.println(res+" is added");

//		 this is a layout for change() method
//		 student std = new student();
//		 
//		 std.setId(1);
//		 std.setCity("texas");
//		 std.setName("ross");
//		 
//		 studentdao.change(std);
//		 System.out.println("changed ");

//		 this is rowmapper for single object
//		 student std = studentdao.getstudent(222);
//		 System.out.println(std);
		
 
//		this is a rowmapper of multiple objects
		List<student> students = studentdao.getsAllstudents();
		for (student s : students) {
			System.out.println(s);
		}

	
	}
}
