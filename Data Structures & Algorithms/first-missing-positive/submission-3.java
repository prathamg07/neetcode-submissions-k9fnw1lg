class Solution {
    public int firstMissingPositive(int[] nums) {

        boolean one = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one = true;
            }

            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }

        if (!one) {
            return 1;
        }

        if (nums.length == 1) {
            return 2;
        }

        // use the current list to mark the negative symbol

        for (int i = 0; i < nums.length; i++) {

            int val = Math.abs(nums[i]);

            if (val == nums.length) {
                nums[0] = -Math.abs(nums[0]);
            } else {
                nums[val] = -Math.abs(nums[val]);
            }
        }

        int n = 1;

        while (n < nums.length) {
            if (nums[n] > 0) {
                return n;
            }
            n++;
        }

        if (nums[0] > 0) {
            return nums.length;
        }

        return nums.length + 1;
    }
}