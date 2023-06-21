class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int[]arr=new int[nums1.length+nums2.length];

        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];

        }
        for(int i=0;i<nums2.length;i++) {

            arr[i+nums1.length] = nums2[i];
        }
        Arrays.sort(arr);
        int l=arr.length;
        int m=l/2;
        if(l%2==0)
        {
            return ((arr[m]+arr[m-1])/2f);
        }
        else
         {
            return arr[m];
        }
    }
}