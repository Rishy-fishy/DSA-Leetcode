class Solution {
    public int arrangeCoins(int n) {
        long s=1,e=n/2;
        while(s<=e)
        {
            long m=s+(e-s)/2;
            long t=m*(m+1)/2;
            if(t>n)
             e=m-1;
            else if(t<n)
             s=m+1;
            else if(t==n)
             return (int)m;
        }
        return (int)e;
    }
}
/*
for 1 stair number of coins required 1.
for 2 stairs number of coins required 1+2.
for 3 stairs number of coins required 1+2+3.
for 4 stairs number of coins required 1+2+3+4.
for 5 stairs number of coins required 1+2+3+4+5.
for n stairs number of coins required n(n+1)/2.
 */