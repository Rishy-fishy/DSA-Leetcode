class Solution {
    public String reverseWords(String s) {
        String[] st=s.trim().split("\\s+");
        String ans="";
        for(int i=st.length-1;i>=0;i--)
         ans+=st[i]+" ";
        return ans.trim();
    }
}