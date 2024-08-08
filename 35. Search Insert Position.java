class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(nums[m]>target)
             e=m-1;
            else if(nums[m]<target)
             s=m+1;
            else
             return m;      //if the element is in the array return the index
        }
        return s;       //if not then return the index of ceil of the number
    }
}