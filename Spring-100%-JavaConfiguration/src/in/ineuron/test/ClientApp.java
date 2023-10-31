package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;


public class ClientApp {

	public static void main(String[] args) throws Exception {
		System.out.println("*****Container Started*****\n");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Bean id info :: "+Arrays.toString(context.getBeanDefinitionNames()));
		
		
		WishMessageGenerator messageGenerator = context.getBean(WishMessageGenerator.class);
		
		messageGenerator.generateWishMessage("Chandan");
		
		((AbstractApplicationContext) context).close();
		System.out.println("\n*****Container Stopped*****");
	}
}
