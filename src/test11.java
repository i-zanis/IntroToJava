import java.util.ArrayList;
import java.util.Arrays;

class test111 {
    class Solution {
        public int singleNumber(int[] nums) {
            if (nums.length == 0) return 0;
            Arrays.sort(nums);

            int[]  newArray = Arrays.copyOfRange(int[] original, int from, int to);

            for (int i = 1; i < nums.length - 2; i++) {
                if (nums[i] != nums[i + 1] && nums[i] != nums[i + 1]) return nums[i];
                else return nums[length - 2];
            }



            return nums[0];
        }
    }
}


