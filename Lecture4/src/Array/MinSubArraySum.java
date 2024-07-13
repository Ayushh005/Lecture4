package Array;

public class MinSubArraySum {
    public static int minSubArrayLen(int target,int[] nums){
        int low = 0;
        int high = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (high = 0;high<nums.length;high++){
            sum += nums[high];
            while (sum >= target){
                min = Math.min(min,high - low + 1);
                sum -= nums[low];
                low++;
            }
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimal length of a subarray: " + result); // Output: 2
    }
}
