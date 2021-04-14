package mentory.spring;

import mentory.componentscan.ComponentDAO;
import mentory.spring.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mentory.componentscan")
public class ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("componentDao: {}", componentDao);
	}

}
