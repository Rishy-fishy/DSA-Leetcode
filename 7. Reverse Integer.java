class Solution {
    public int reverse(int x) {
        long n=0;
        while(x!=0)
        {
            int t=x%10;
            n=(n*10)+t;
            x/=10;
        }
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE)
         return 0;
        if(x<0)
         return (-1)*(int)n;
        return (int)n;
    }
}