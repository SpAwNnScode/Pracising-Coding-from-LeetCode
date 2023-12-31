class Solution {
    public static int removeDuplicates(int[] nums) {

            int i = 1; 
            int j = 0; 
            for (; i<nums.length; i++) {
                if (nums[i] != nums[j]) { 
                    j++; 
                    nums[j] = nums[i]; 
                }
            }

            return ++j;
        }
}