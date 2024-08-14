class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length()+word2.length()-1;
        String s="";
        for(int i=0;i<m;i++)
        {
            if(i<word1.length())
             s+=word1.charAt(i);
            if(i<word2.length())
             s+=word2.charAt(i);            
        }
        return s;
    }
}