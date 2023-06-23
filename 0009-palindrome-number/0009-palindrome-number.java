class Solution {
    public static boolean isPalindrome(int x) {

            int q=0;
            int z=0;
            int c=x;
            while(x>0)
            {
                q=x%10;
                z=z*10+q;
                x=x/10;

            }
            if(c==z)
            {
                return true;
            }
            
            return false;
    }
}