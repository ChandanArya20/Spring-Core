package ai.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.ineuron.service.UserService;

public class MyMainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		UserService service=context.getBean(UserService.class);

	}
}
