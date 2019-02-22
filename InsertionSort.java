public class InsertionSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int temp = a[i];
            int j = i - 1; //comparing item to the left
            while (j >= 0 && temp < a[j])
            {
                a[j+1] = a[j];
                j--; 
            } //while
            a[j+1] = temp;
        } //for
    }

    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}