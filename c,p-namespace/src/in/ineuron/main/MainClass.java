package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Employee;



public class MainClass {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext1.xml");
		
		System.out.println("--------------------Container started-------------------");
		
	    Employee employee = factory.getBean("emp", Employee.class);
		
		
		System.out.println(employee);
		
			
		factory.close();
		System.out.println("--------------------Container stoped-------------------");
	}
}
