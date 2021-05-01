package mentory.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContextDependencyInjectionBusinessTest {

    //Create Mock
    @Mock
    private ContextDependencyInjectionDAO contextDependencyInjectionDAO;

    //Inject Mock
    @InjectMocks
    private ContextDependencyInjectionBusiness contextDependencyInjectionBusiness;

    @Test
    public void testBasicScenario1() {
        //when daoMock.getData() method is called, return int[] {2, 4}
        when(contextDependencyInjectionDAO.getData()).thenReturn(new int[] {2, 4});

        int result = contextDependencyInjectionBusiness.findGreatest();

        assertEquals(4, result);
    }

    @Test
    public void testBasicScenario_NoValues() {
        when(contextDependencyInjectionDAO.getData()).thenReturn(new int[] {});

        int result = contextDependencyInjectionBusiness.findGreatest();

        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void testBasicScenario_EqualElements() {
        when(contextDependencyInjectionDAO.getData()).thenReturn(new int[] {2, 2});

        int result = contextDependencyInjectionBusiness.findGreatest();

        assertEquals(2, result);
    }

}
