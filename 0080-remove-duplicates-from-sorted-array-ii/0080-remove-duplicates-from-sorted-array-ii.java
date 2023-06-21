class Solution {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int j = 0;
        int count=0;
        for(int i=1;i<nums.length;i++) {
            if (nums[i] == nums[j++]) {
                count++;
            }
            else {count=0;}
            if (count <= 1) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}