package mentory.spring;

import mentory.spring.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("personDao1: {}", personDao1);
		LOGGER.info("personDao1.jdbc: {}", personDao1.getJdbcConnection());
		LOGGER.info("personDao1.jdbc2: {}", personDao1.getJdbcConnection());
		LOGGER.info("personDao2: {}", personDao2);
		LOGGER.info("personDao2.jdbc: {}", personDao2.getJdbcConnection());
	}

}
