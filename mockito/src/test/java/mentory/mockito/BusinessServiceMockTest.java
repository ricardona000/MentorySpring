package mentory.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessServiceMockTest {

    @Test
    public void testFindGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 6});
        BusinessService businessService = new BusinessService(dataServiceMock);

        int result = businessService.findGreatestFromAllData();

        assertEquals(24, result);
    }

    @Test
    public void testFindGreatestFromAllData_ForOneSingleValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        BusinessService businessService = new BusinessService(dataServiceMock);

        int result = businessService.findGreatestFromAllData();

        assertEquals(15, result);
    }

}
