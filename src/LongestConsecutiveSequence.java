import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {2, 20, 4, 10, 3, 4, 5};
        System.out.print(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int temp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                count++;
            } else if (nums[i] == nums[i + 1]) {

            } else {
                if (count > temp) {
                    temp = count;
                }
                count = 1;
            }
        }
        if (count > temp) {
            temp = count;
        }
        return temp;
    }
}
