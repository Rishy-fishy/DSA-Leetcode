class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int c=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[c])
             swap(nums,i,c);
            else
             i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
             return j;
        }
        return nums.length;
    }
    public static void swap(int[] a,int b,int c)
    {
        int t=a[b];
        a[b]=a[c];
        a[c]=t;
    }
}