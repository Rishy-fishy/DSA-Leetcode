class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
         return false;
        int n=0,m=x;
        while(x>0)
        {
            int t=x%10;
            n=(n*10)+t;
            x/=10;
        }
        if(n==m)
         return true;
        return false;
    }
}