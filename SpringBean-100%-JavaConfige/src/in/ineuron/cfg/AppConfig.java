package in.ineuron.cfg;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages={"in.ineuron"})
public class AppConfig {

	static {
		System.out.println("AppConfig class is loading...");
	}
	public AppConfig() {
		System.out.println("AppConfig class obj is instantiated...");
	}
	
	@Bean("time1")
	public LocalTime createTime1() {
		System.out.println("AppConfig.createTime1()");
		return LocalTime.now();
	}
	@Bean("time2")
	public LocalTime createTime2() {
		System.out.println("AppConfig.createTime2()");
		return LocalTime.now();
	}
}
