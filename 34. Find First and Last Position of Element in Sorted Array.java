class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};      //the answer if the nuber doesn't exist
        ans[0]=find(nums, target, false);       //try finding the first position
        if(ans[0]!=-1)                                //if there is first position then only check for the last 
         ans[1]=find(nums, target, true);       
        return ans;                                   
    }
    public int find(int[] a, int t, boolean first)
    {
        int k=-1,s=0,e=a.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(t>a[m])
             s=m+1;
            else if(t<a[m])
             e=m-1;
            else
            {
                k=m;
                if(!first)      //to find the first position we need to check for more occurrence of the number in the left side
                 e=m-1;
                else
                 s=m+1;         ////to find the last position we need to check for more occurrence of the number in the right side
            }
        }
        return k;
    }
}