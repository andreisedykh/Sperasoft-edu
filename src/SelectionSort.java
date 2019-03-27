import java.util.Scanner;

public class SelectionSort {

    public static void main(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int arr[] = new int[arrayLength];

        System.out.print("Before sorting");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");

        }

        main(arr);
        System.out.println();
        System.out.print("After sorting");
        System.out.println();
        ob.printArray(arr);
    }

}
