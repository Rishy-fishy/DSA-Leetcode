class Solution {
    public int findMin(int[] nums) {
        int p=find(nums);
        return nums[p+1];   //after finding the pivot return the next element
    }
    public static int find(int[] arr)       // to find the pivot element
    {
        int s=0;
        int e=arr.length-1;
        while (s<=e) 
        {
            int m=s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1])      //if element at m is > element at m+1 then pivot is at m
             return m;
            if(m>s && arr[m]<arr[m-1])      //if element at m is < element at m+1 then pivot is at m-1
             return m-1;
            if(arr[m]<=arr[s])
             e=m-1;
            else
             s=m+1;
        }
        return -1;
    }
}