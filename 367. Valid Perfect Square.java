class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1)
         return true;
        int s=1,e=num/2;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if((long)m*m>num)
             e=m-1;
            else if((long)m*m<num)
             s=m+1;
            else if(m*m==num)
             return true;
        }
        return false;
    }
}