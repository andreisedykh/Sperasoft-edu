import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class BinarySearch {

    public static void BinarySearchArray() {
        int elementValue, first, last;
        System.out.println("\nEnter array size number");
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();

        while (arrayLength <= 0 || arrayLength > 256) {
            System.out.println("Please enter a positive number between 1 and 256");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
            arrayLength = scan.nextInt();
        }

        // вводим число = длине массива
        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) { // заполняем массив значениями
            array[i] = random.nextInt(100);;
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(array));

        System.out.println("\nEnter element for binary search"); //its better to use \n instead of empty sout to reduce code size
        elementValue = scan.nextInt();// вводим индекс искомого елемента
        first = 0;
        last = elementValue - 1;
        binarySearch(array, first, last, elementValue);

    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int elementValue) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != elementValue) && (first <= last)) {
            comparisonCount++;
            if (array[position] > elementValue) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(elementValue + " is " + ++position + " element in array");
            System.out.println("Binary search found number after " + comparisonCount +
                    " comparisions");
        } else {
            System.out.println("Element not found. Binary search finished after "
                    + comparisonCount + " comparisions");
        }
    }

}
