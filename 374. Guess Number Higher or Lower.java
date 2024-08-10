class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=1,e=n;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(guess(m)==-1)        //means m > the number
             e=m-1;
            else if(guess(m)==1)        //means m < the number
             s=m+1;
            else if(guess(m)==0)        ////means m = the number
             return m;
        }
        return -1;        
    }
}