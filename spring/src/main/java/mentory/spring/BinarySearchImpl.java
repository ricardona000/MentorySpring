package mentory.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quickSort")
    private SortAlgorithm sortAlgorithm;

    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Sort algorithm
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Search the array

        return 3;
    }

}
