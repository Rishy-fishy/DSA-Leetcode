class Solution {
    public int splitArray(int[] nums, int k) {
        int s=0,e=0;
        for(int i=0;i<nums.length;i++)
        {
            s=Math.max(s,nums[i]);  //s (start): The largest value when k=size of array, the largest number.
            e+=nums[i]; //e (end): The largest value when k=1, the sum of the array.
        }
        while(s<e)
        {
            int m=s+(e-s)/2;    //m is the potential largest sum we're testing. The goal is to minimize this value.
            int sum=0,p=1;  //p: Counts the number of subarrays formed. sum: Keeps track of the sum of the current subarray.
            for(int a:nums)
            {
                if(sum+a>m) //If adding the current element a to the current subarray's sum would exceed the value of m, it means we need to start a new subarray.
                {
                    sum=a;  //Start a new subarray with the current element.
                    p++;    
                }
                else    //If adding the current element a does not exceed m, continue adding elements to the current subarray
                 sum+=a;
            }
            if(p>k) //If the number of subarrays formed is greater than k, it means the value of m is too small, so we need to search in the higher half
             s=m+1;
            else    //If the number of subarrays formed is less than or equal to k, it means we can try a smaller value of m
             e=m;
        }
        return e;   //Finally, when the loop ends, s will be equal to e, and it represents the minimized largest sum possible.
    }
}