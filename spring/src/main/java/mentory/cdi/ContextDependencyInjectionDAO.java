package mentory.cdi;

import javax.inject.Named;

@Named
public class ContextDependencyInjectionDAO {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }
}
