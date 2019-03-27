import java.util.Scanner;
import java.util.*;

public class ArraySearch {

    public static void SearchArray() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу

        boolean isIntInArray = false;

        for (int i = 0; i < arrayLength; i++) { // заполняем массив значениями
            array[i] = i;
            System.out.print(array[i] + " ");

        }

        System.out.println();
        System.out.println("Enter element you are searching for");
        int elementValue = scan.nextInt(); // вводим индекс искомого елемента

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == elementValue) {
                isIntInArray = true;
                System.out.println("Element exist in array");
            }

        }
        System.out.println(isIntInArray + ". Element does not exist in array");


    }

}
