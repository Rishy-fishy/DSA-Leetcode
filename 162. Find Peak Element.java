class Solution {
    public int findPeakElement(int[] nums) {
        int s=0,e=nums.length-1;
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(nums[m]>nums[m+1])     //if the element if greater than the next element that means we are in the decreasing part of array 
             e=m;                     //the peal element maybe m or on thee left side of the array
            else if(nums[m]<nums[m+1])
             s=m+1;
        }
        return s;
    }
}