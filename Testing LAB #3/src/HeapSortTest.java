import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;
public class HeapSortTest {
    @Test
    public void heapSortTest() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer arr1[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
        Integer arr2[] = { 5, 46, 25, 13, 12 };
        Integer arr3[] = { 5, 46 };

        heapSort.sort(arr1, true);
        assertTrue(Arrays.equals(arr1, new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 }));

        heapSort.sort(arr1, false);
        assertTrue(Arrays.equals(arr1, new Integer[] { 8, 7, 6, 5, 4, 3, 2, 1 }));

        heapSort.sort(arr2, true);
        assertTrue(Arrays.equals(arr2, new Integer[] { 5, 12, 13, 25, 46 }));

        heapSort.sort(arr2, false);
        assertTrue(Arrays.equals(arr2, new Integer[] { 46, 25, 13, 12, 5 }));

        heapSort.sort(arr3, true);
        assertTrue(Arrays.equals(arr3, new Integer[] { 5, 46 }));

        heapSort.sort(arr3, false);
        assertTrue(Arrays.equals(arr3, new Integer[] { 46, 5 }));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Array #1:" + arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Array #2:" + arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Array #3:" + (int)arr3[i]);
        }
    }
}