package mentory.spring.basic;

import mentory.spring.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the context
@ContextConfiguration(classes = {Application.class})
@RunWith(SpringRunner.class)
public class BinarySearchTest {

    // Get this bean from the context
    @Autowired
    private BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int result = binarySearch.binarySearch(new int[] {}, 5);

        assertEquals(3, result);
    }

}
