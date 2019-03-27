import java.util.*;

class GetMin {

    public static int getMin(int a, int b, int c, int d){
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);
        int minvalue;
        minvalue = nums[0];
        System.out.println("Minimum value is " + minvalue);
        return minvalue;
    }

}