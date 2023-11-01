import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SetterInjection {

	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("applicationContext.xml");

		System.out.println("***********BeanFactory container starting************");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("***********BeanFactory container started*************");

		
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg+"\n");

		
		String result = wmg.generateMessage("Chandan");
		System.out.println(result);
		System.out.println();
		
		System.out.println("*******Container is closing**********");
	}

}
