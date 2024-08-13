class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i<nums.length)
        {
            int c=nums[i]-1;
            if(nums[i]!=nums[c])
             swap(nums,i,c);
            else 
             i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
             list.add(nums[j]);
        }
        return list;
    }
    public static void swap(int[] a,int b,int c)
    {
        int t=a[b];
        a[b]=a[c];
        a[c]=t;
    }
}