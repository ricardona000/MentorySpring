package mentory.mockito;

public class BusinessService {

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    int findGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }

        return greatest;
    }

}
