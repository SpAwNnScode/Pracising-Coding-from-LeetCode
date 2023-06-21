public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int []a=new int[26];
        if(ransomNote.length()>magazine.length())
        {
            return false;
        }
        else
            for(char c: magazine.toCharArray())
            {
               a[c - 'a']++;
            }
            for(char c: ransomNote.toCharArray())
            {
                if(a[c-'a']==0)
                {
                    return false;
                }
                a[c-'a']--;
            }

        return true;
    }
}