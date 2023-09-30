package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggCourse;




public class MainClass {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("--------------------Container started-------------------");
		
	   EnggCourse courses = factory.getBean("CS", EnggCourse.class);
		
		
		System.out.println(courses);
		
			
		factory.close();
		System.out.println("--------------------Container stoped-------------------");
	}
}
