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

    public int findGreatest() {
        int[] data = contextDependencyInjectionDAO.getData();
        int greatest = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }

}
