class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1,e=n;
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(isBadVersion(m))     //to find the first true version
             e=m;
            else 
             s=m+1;
        }
        return e;
    }
}