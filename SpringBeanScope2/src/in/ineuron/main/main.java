package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

public class main {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("--------------------Container started-------------------");
		
		System.in.read();
		
		Student student1 = factory.getBean("std", Student.class);
		System.out.println(student1+" available at : "+student1.hashCode());
		
		Student student2 = factory.getBean("std", Student.class);
		System.out.println(student2+" available at : "+student2.hashCode());
		
		System.out.println("--------------------Container stoped-------------------");
	}
}
