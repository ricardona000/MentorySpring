package mentory.spring;

import mentory.spring.basic.BinarySearchImpl;
import mentory.spring.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {

		// Application Context
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class)) {
            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            System.out.println("someExternalService = " + someExternalService);
            System.out.println("external url = " + someExternalService.returnServiceURL());
        }

		//applicationContext.close();
	}

}
