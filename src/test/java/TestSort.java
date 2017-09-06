import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSort {

    private Integer []arr = {2,4,56,1,8,5,3,24,9};
    private ArrayWithSort<Integer> array = new ArrayWithSort<Integer>(arr);

    @Before
    public void sort(){
        array.sort();
    }

    // проверка на соответствие
    @Test
    public void testing() {
        Integer []arr1 = {1,2,3,4,5,8,9,24,56};
        assertEquals(arr1,array.getArray());
    }

    // проверка на несоответствие
    @Test
    public void failTest() {
        Integer []arr1 = {2,4,56,1,8,5,3,24,9};
        assertEquals(arr1,array.getArray());
    }
    
    // проверка исключений
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWithException() throws IndexOutOfBoundsException{
        Integer []arr1 = {1,2,3,4,5,8,9,24,56};
        assertEquals(arr1[arr1.length], array.getArray()[array.getArray().length]);
    }
}
