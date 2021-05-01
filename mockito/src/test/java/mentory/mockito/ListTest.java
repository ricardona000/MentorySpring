package mentory.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testSize() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(10);

        assertEquals(10, listMock.size());
    }

    @Test
    public void testSize_multipleReturns() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(10).thenReturn(20);

        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
    }

    @Test
    public void testGet_SpecificParameter() {
        List listMock = mock(List.class);

        when(listMock.get(0)).thenReturn("SomeString");

        assertEquals("SomeString", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGet_GenericParameter() {
        List listMock = mock(List.class);

        when(listMock.get(anyInt())).thenReturn("SomeString");

        assertEquals("SomeString", listMock.get(0));
        assertEquals("SomeString", listMock.get(1));
    }

}
