import java.util.Objects;
public class HeapSort<T extends Comparable<T>>
{
    private T arr[];
    private int length;
    public void sort(T[] arr, boolean flag)
    {
        Objects.nonNull(arr);
        this.arr = arr;
        length = arr.length;
        if (flag == true)
            sortAscending(arr);
        else
            sortDescending(arr);
    }
    private void sortDescending(T arr[])
    {
        buildMinHeap();
        swap(0, length - 1);
        length--;
        while (length > 0)
        {
            minHeap(0);
            swap(0, length - 1);
            length--;
        }
    }
    private void sortAscending(T arr[])
    {
        buildMaxHeap();
        swap(0, length - 1);
        length--;
        while (length > 0)
        {
            maxHeap(0);
            swap(0, length - 1);
            length--;
        }
    }
    private void buildMaxHeap()
    {
        int start = length / 2;
        for (int i = start - 1; i > -1; i--)
        {
            maxHeap(i);
        }
    }
    private void buildMinHeap()
    {
        int start = length / 2;
        for (int i = start - 1; i > -1; i--)
        {
            minHeap(i);
        }
    }
    private void minHeap(int position)
    {
        int left = 2 * position + 1;
        int right = left + 1;
        int temp = position;
        if (left < length && arr[left].compareTo(arr[temp]) < 0)
            temp = left;
        if (right < length && arr[right].compareTo(arr[temp]) < 0)
            temp = right;
        if (temp == position)
            return;
        swap(position, temp);
        minHeap(temp);
    }
    private void maxHeap(int position)
    {
        int left = 2 * position + 1;
        int right = left + 1;
        int temp = position;
        if (left < length && arr[left].compareTo(arr[temp]) > 0)
            temp = left;
        if (right < length && arr[right].compareTo(arr[temp]) > 0)
            temp = right;
        if (temp == position)
            return;
        swap(position, temp);
        maxHeap(temp);
    }
    private void swap(int i, int j)
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}