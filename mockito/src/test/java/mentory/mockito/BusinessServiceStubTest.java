package mentory.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessServiceStubTest {

    @Test
    public void testFindGreatestFromAllData() {
        BusinessService businessService = new BusinessService(new DataServiceStub());

        int result = businessService.findGreatestFromAllData();

        assertEquals(24, result);
    }

}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 6, 15};
    }
}
