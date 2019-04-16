
public class Main {

    public static void main(String[] args) {

        GetMin minimum = new GetMin();
        minimum.getMin(15, 77, 24, 99);

        ArraySearch search = new ArraySearch();
        search.SearchArray();

        BinarySearch search1 = new BinarySearch();
        search1.BinarySearchArray();

        CountElement count = new CountElement();
        count.countElement();

        BubbleSort sort1 = new BubbleSort();
        sort1.bubbleAction();

        SelectionSort sort2 = new SelectionSort();
        sort2.selectionSort();

    }
}