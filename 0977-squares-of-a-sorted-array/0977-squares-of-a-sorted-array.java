class Solution {
    public static int[] sortedSquares(int[] nums) 
         {
        int s = 0;
        int temp=0;
        int[] arr = new int[nums.length];
        int i = 0;

        for (int num : nums) {
            s = num * num;
            arr[i] = s;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }
}

   