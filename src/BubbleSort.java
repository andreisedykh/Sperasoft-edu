import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleAction() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива

        while (arrayLength <= 0 || arrayLength > 256) {
            System.out.println("Please enter a positive number between 1 and 256");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
            arrayLength = scan.nextInt();
        }

        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу
        /**the same kind of assertions as {@link ArraySearch#SearchArray()} method */

        System.out.print("Before sorting" + "\n"); /**Use \n instead of System.out.println()*/

        for (int i = 0; i < array.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            array[i] = (int) (Math.random() * 100); /**You could use  System.out.print(Arrays.toString(array)) instead of cycle*/
        }
        System.out.print(Arrays.toString(array));
        bubbleSort(array);

        System.out.print("\nAfter sorting" + "\n");

        System.out.print(Arrays.toString(array));
    }
    /**You could give to this method #private access key because you only use this locally*/
    private static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,если они имеют неправильный порядок, то меняем местами*/
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

}

