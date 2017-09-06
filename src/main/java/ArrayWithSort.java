import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayWithSort <T extends Number> {

    private T []array;

    public ArrayWithSort(T []newArray){
        array = newArray;
    }

    public T[] getArray() {
        return array;
    }

    void sort (){
        Arrays.sort(this.array, new Comparator<T>() {
            public int compare(T a, T b){
                return new BigDecimal(a.toString()).compareTo(new BigDecimal(b.toString()));
            }
        });
    }

}
