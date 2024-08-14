class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] st=s.split(" ");
        int n=st.length-1;
        return st[n].length();
    }
}