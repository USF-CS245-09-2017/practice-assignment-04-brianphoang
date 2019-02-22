public class BubbleSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        boolean swapped = true;
        for (int j = 0; j < a.length && swapped; j++)
        {
            swapped = false;
            for (int i = 0; i < a.length - 1 - j; i++)
            if (a[i] > a[i+1]) //compares two consecutive elements in array
            {
                swap(a, i, i + 1);
                swapped = true;
            } //if 
        } // for
    }

    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}