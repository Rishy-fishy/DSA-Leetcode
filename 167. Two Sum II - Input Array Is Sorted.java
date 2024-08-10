class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int t=nums[l]+nums[r];
            if(t>target)
             r--;
            else if(t<target)
             l++;
            else
             return new int[]{l+1,r+1};
        }
        return new int[]{-1,-1};
    }
}
/*
Two pointer method
2 7 11 15
l       r
if l+r > target
2 7 11 15
l    r
and so on
 */