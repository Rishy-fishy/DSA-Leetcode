class Solution 
{
    public int mySqrt(int x) 
    {
        if(x==0 || x==1)
         return x;
        int s=1,e=x/2;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if((long) m*m> (long)x)
             e=m-1;
            else if((long)m*m<(long)x)
             s=m+1;
            else
             return m;
        }
        return Math.round(e);       //as s value might be wrong as it also terminates the while loop
    }
}