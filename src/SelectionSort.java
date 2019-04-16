import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

    
    /** Bad naming (please use more intuitive naming)*/
    private static void selectionSorting(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;           /**Code of conduct: minIdx instead of min_idx*/

            // Swap the found minimum element with the first
            // element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    private static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i) {  /**Code of conduct: { } for each loop / if/else and ect.*/ 
           
        }
        System.out.print(Arrays.toString(arr) + "\n");
    }

    // Driver code to test above
    public static void selectionSort()
    {
      /**No need to create instance of object if you just use class as utility (all methods are static)
        In common case you do not work within main class (entry point) so each of instance method could be accessible from another (exclude static methods) */
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter array size number");
        int arrayLength;
        while ((arrayLength = scan.nextInt()) < 0) {
            System.out.println(String.format("%d - is a wrong number! Repeat the input", arrayLength));
        }
        int arr[] = new int[arrayLength];

        System.out.print("Before sorting\n");

        Random random = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  random.nextInt(100);
        }
        System.out.print(Arrays.toString(arr));

        selectionSorting(arr);
        System.out.print("\nAfter sorting\n");
        printArray(arr);
    }

}
