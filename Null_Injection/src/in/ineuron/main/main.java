package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.PersonInfo;




public class main {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("--------------------Container started-------------------");
		
	    PersonInfo personInfo = factory.getBean("person", PersonInfo.class);
		
		
		System.out.println(personInfo);
		
			
		factory.close();
		System.out.println("--------------------Container stoped-------------------");
	}
}
