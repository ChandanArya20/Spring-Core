package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.ineuron.comp.Student;

public class TestApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
//		FileSystemResource resource = new FileSystemResource("src/applicationContext.xml");
//		@SuppressWarnings("deprecation")
//		XmlBeanFactory factory = new XmlBeanFactory(resource);
//		
		Student student=factory.getBean("std",Student.class);
		System.out.println(student);
		
		
	}

}
