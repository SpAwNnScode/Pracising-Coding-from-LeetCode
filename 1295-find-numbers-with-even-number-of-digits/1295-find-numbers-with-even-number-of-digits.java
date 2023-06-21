class Solution {
    public int findNumbers(int[] nums) {
        int i=0;
                int c=0;
            for(int num:nums)
            {
                while(num!=0)
                {

                    num=num/10;
                    i++;
                }
                if(i%2==0)
                {
                    c++;
                }
                i=0;
            }
        
    return c;}
        
    }
