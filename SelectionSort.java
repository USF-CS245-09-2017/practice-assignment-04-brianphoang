public class SelectionSort implements SortingAlgorithm
{
    public void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            //find smallest number and swap with the element in list
            int minimum = minimum (a, i);
            swap (a, minimum, i);
        } //for
    }

    public int minimum (int[] a, int start)
    {
        //begin with the smallest number
        int minimum = start; 
        for (int i = start + 1; i < a.length; i++)
        {
            if (a[i] < a[minimum]) 
            {
                minimum = i;
            } //if
        } //for
        return minimum;
    }
}