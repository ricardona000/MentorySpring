package mentory.spring;

import mentory.cdi.ContextDependencyInjectionBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("mentory.cdi")
@Configuration
public class ContextDependencyInjectionApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ContextDependencyInjectionApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ContextDependencyInjectionApplication.class);
        ContextDependencyInjectionBusiness contextDependencyInjectionBusiness =
                applicationContext.getBean(ContextDependencyInjectionBusiness.class);
        LOGGER.info("contextDependencyInjectionBusiness {}, DAO {} ", contextDependencyInjectionBusiness,
                contextDependencyInjectionBusiness.getContextDependencyInjectionDAO());
    }

}
