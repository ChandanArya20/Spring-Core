package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.UniversityInfo;



public class main {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("--------------------Container started-------------------");
		
	    UniversityInfo unInfo = factory.getBean("unInfo", UniversityInfo.class);
		
		
		System.out.println(unInfo);
		
			
		factory.close();
		System.out.println("--------------------Container stoped-------------------");
	}
}
