package mentory.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ContextDependencyInjectionBusiness {

    @Inject
    private ContextDependencyInjectionDAO contextDependencyInjectionDAO;

    public ContextDependencyInjectionDAO getContextDependencyInjectionDAO() {
        return contextDependencyInjectionDAO;
    }

    public void setContextDependencyInjectionDAO(ContextDependencyInjectionDAO contextDependencyInjectionDAO) {
        this.contextDependencyInjectionDAO = contextDependencyInjectionDAO;
    }

}
