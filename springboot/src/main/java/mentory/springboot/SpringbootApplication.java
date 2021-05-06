package mentory.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// This annotation enables: Spring Context, Auto Configuration, Component Scan
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println("Bean name: " + name);
		}
	}

}
