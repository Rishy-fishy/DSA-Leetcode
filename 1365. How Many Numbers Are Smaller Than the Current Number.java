class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[102];
        for(int i=0;i<nums.length;i++)
         ans[nums[i]+1]++;
        for(int i=0;i<101;i++)
         ans[i+1]+=ans[i];
        for(int i=0;i<nums.length;i++)
         nums[i]=ans[nums[i]];
        return nums;
    }
}
/*
dry run 
nums= 9 8 6 2 5 3
1st loop:
ans10=1
ans9=1
ans7=1
ans3=1
ans6=1
ans4=1

2nd loop:
ans3=ans3+ans2==1
ans4=ans4+ans3=1+1=2
ans5=ans5+ans4=0+2=2
ans6=ans6+ans5=1+2=3
ans7=ans7+ans6=1+3=4
ans8=ans8+ans7=0+4=4
ans9=ans9+ans8=1+4=5
ans10=ans10+ans9=1+5=6

3rd loop:
nums0=ans9=5
nums1=ans8=4
nums2=ans6=3
nums3=ans2=0
nums4=ans5=2
nums5=ans3=1

 */
/*
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length,c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j])
                 c++;
            }
            arr[i]=c;
            c=0;
        }
        return arr;
    }
}
*/