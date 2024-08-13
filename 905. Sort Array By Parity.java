class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int s=0,e=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
             ans[s++]=nums[i];
            else
             ans[e--]=nums[i];
        }
        return ans;
    }
}