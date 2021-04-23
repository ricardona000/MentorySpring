package mentory.spring;

import mentory.spring.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class XmlContextApplication {

	public static void main(String[] args) {

		// Application Context
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println("xmlPersonDAO = " + xmlPersonDAO);
            System.out.println("xmlJdbcConnection = " + xmlPersonDAO.getXmlJdbcConnection());
        }

		//applicationContext.close();
	}

}
