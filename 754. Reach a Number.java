class Solution {
    public int reachNumber(int target) {
        int s=1,t=0;
        if(target<0)
         target=0-target;
        if(target==0)
         return 0;
        while(t<target)
        {
            t+=s;
            s++;
        }
        while((target-t)%2!=0)
        {
            t+=s;
            s++;
        }
        return s-1;
    }
}