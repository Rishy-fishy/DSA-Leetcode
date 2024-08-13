class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int i=0;
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
             l.add(j+1);
        }
        return l;
    }
    public static void swap(int[] a,int b,int c)
    {
        int t=a[b];
        a[b]=a[c];
        a[c]=t;
    }
}