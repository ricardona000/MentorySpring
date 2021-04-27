package test;

import org.junit.*;

import static org.junit.Assert.*;

public class AssertTest {

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }

    @Test
    public void test() {
        System.out.println("test");
        assertEquals(1, 1);
    }

    @Test
    public void conditionalAsserts() {
        System.out.println("conditionalAsserts");
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void nullAsserts() {
        System.out.println("nullAsserts");
        assertNull(null);
        assertNotNull(new Object());
    }

}
