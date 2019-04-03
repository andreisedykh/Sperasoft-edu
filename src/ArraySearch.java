import java.util.Scanner;

public class ArraySearch {

    public static void SearchArray() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу
        /**it is a good practice to validate input data. For example, I still could enter -1 or 0 and program will crash then 
        (you could wrap console input by while cycle and validate if it is valid number -> exit, else - do input again) */
        boolean isIntInArray = false;

        for (int i = 0; i < arrayLength; i++) { // заполняем массив значениями
            array[i] = i;                       /**you should generate random integer instead loop index. Please use new Random().nextInt(bound)
                                                docs: https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int- */
            System.out.print(array[i] + " ");
            
        }
        
        System.out.println("\nEnter element you are searching for"); //its better to use \n instead of empty sout to reduce code size
        int elementValue = scan.nextInt(); // вводим индекс искомого елемента

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == elementValue) {
                isIntInArray = true;
                System.out.println("Element exist in array");
            }

        }
        /**in this case 'Element does not exist in array' will always appear (even if element was found)
        its better to do if/else structure to output valid string */
        System.out.println(isIntInArray + ". Element does not exist in array");

        //TODO binary search
        //TODO (optional) it will be good if you deal with time execution and create some output about it (use Stopwatch or System.nanoTime)
    }

}
