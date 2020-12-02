import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int[] temp = new int[2];
        int temp[0] = Integer.MAX_VALUE;
        int temp[1] = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++);
            if (nums[i] + nums[j] == target) {
                temp[0] = nums[i];
                temp[1] = nums[j];
                return temp;
            }
        }
    }
}