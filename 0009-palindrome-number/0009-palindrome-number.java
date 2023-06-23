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

----------------------------------------------------
    or as a String
    
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        for (int i = 0; i < s.length() / 2; i++){
            
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
            return true;
    }
