package mentory.spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quickSort")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        //logic for quick sort
        return numbers;
    }

}
