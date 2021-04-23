package mentory.spring;

import mentory.cdi.ContextDependencyInjectionBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("mentory.cdi")
@SpringBootApplication
public class ContextDependencyInjectionApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ContextDependencyInjectionApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ContextDependencyInjectionApplication.class, args);
        ContextDependencyInjectionBusiness contextDependencyInjectionBusiness =
                applicationContext.getBean(ContextDependencyInjectionBusiness.class);
        LOGGER.info("contextDependencyInjectionBusiness {}, DAO {} ", contextDependencyInjectionBusiness,
                contextDependencyInjectionBusiness.getContextDependencyInjectionDAO());
    }

}
