import java.util.Arrays;

public class ProductsOfArrayExceptSelf {
    public static void main(String[] args) {
        int []nums = {1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
int [] result = new int[nums.length];
int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    temp *= nums[j];
                }
            }
            result[i] = temp;
            temp=1;
        }
        return result;
    }
}
