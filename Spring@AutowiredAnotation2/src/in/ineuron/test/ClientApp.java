package in.ineuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkart;

public class ClientApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = factory.getBean(Flipkart.class);
		flipkart.doShopping(new String[] {"soap","biscuit"}, new float[] {1200,1500});
		
		
		factory.close();
	}
}
