package test;

import main.MyMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    // Absence of failure is a success

    @Test
    public void sumWith3Numbers() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {1, 2, 3});
        // Check that the sum is 6
        assertEquals(6, result);
    }

    @Test
    public void sumWithOnly1Number() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {3});
        assertEquals(3, result);
    }

}
