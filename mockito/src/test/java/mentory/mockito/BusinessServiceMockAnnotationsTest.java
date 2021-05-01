package mentory.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessServiceMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessService businessService;

    @Test
    public void testFindGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 6});

        int result = businessService.findGreatestFromAllData();

        assertEquals(24, result);
    }

    @Test
    public void testFindGreatestFromAllData_ForOneSingleValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        int result = businessService.findGreatestFromAllData();

        assertEquals(15, result);
    }

    @Test
    public void testFindGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

        int result = businessService.findGreatestFromAllData();

        assertEquals(Integer.MIN_VALUE, result);
    }

}
