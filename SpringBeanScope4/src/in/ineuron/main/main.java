package in.ineuron.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

public class main {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("--------------------Container started-------------------");
		
		
		System.out.println("Bean id is :: " +Arrays.toString(factory.getBeanDefinitionNames()));
		
		Student student1 = factory.getBean("in.ineuron.comp.Student#0", Student.class);
		System.out.println(student1+" available at : "+student1.hashCode());
		
		Student student2 = factory.getBean("in.ineuron.comp.Student#1", Student.class);
		System.out.println(student2+" available at : "+student2.hashCode());
		
		Student student3 = factory.getBean("in.ineuron.comp.Student#2", Student.class);
		System.out.println(student3+" available at : "+student3.hashCode());
		
		
		factory.close();
		System.out.println("--------------------Container stoped-------------------");
	}
}
