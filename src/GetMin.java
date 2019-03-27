import java.util.Arrays;

class GetMin {
    /**
     *Implementation should contains 3 overloaded method, each of them should have specific number of parameters
     * 
     * 1 method: getMin(a, b)
     * 2 method: getMin(a, b, c)
     * 3 method: getMin(a, b, c, d)
     * Please note that all of those method should be connected. e.g second method should use first and the third method should use second
     * 
     * 
     * 
     * 
     * Example: 
     * 
     * 
     * 
     */
    
    public static void example1(){
        System.out.println("I'm the first method!\n");
    }
    
    public static void example2(String string){
        example1();
        System.out.println("I'm the second method!");
    }
    
    
    public static int getMin(int a, int b, int c, int d){
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);
        int minvalue;
        minvalue = nums[0];
        System.out.println("Minimum value is " + minvalue); /**you also could use String.format to pass arguments to string, example: String.format("Minimum value is %s", minvalue);
                                                            docs: https://docs.microsoft.com/ru-ru/dotnet/api/system.string.format?view=netframework-4.7.2 */
        return minvalue;
    }

}