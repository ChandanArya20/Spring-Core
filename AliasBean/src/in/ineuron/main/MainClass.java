package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.StudentInformation;


public class MainClass {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("--------------------Container started-------------------");
		
		StudentInformation student = factory.getBean("studentInformation", StudentInformation.class);		
		System.out.println(student);
		
		StudentInformation std = factory.getBean("std", StudentInformation.class);		
		System.out.println(std);
		
			
		factory.close();
		System.out.println("--------------------Container stoped-------------------");
	}
}
