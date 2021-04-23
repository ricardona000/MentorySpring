package mentory.spring;

import mentory.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("mentory.componentscan")
@Configuration
public class ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		// Application Context
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanApplication.class);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("componentDao: {}", componentDao);
	}

}
