public class Solution {
    public int findMin(int[] nums) {
        int p=find(nums);   
        return nums[p+1];   //after finding the pivot return the next element
    }
    public static int find(int[] arr) {
        int s=0;
        int e=arr.length - 1;
        while(s<=e) 
        {
            int m=s+(e-s) / 2;
            if(m<e && arr[m]>arr[m+1]) 
             return m;
            if(m>s && arr[m]<arr[m-1]) 
             return m-1;           
            if(arr[m]==arr[s] && arr[m]==arr[e]) 
            {
                if(s<e && arr[s]>arr[s+1])  // check if start is pivot
                 return s;
                s++;
                if(s<e && arr[e]<arr[e-1])  // check if end is pivot
                 return e-1;
                e--;
            }
            else if(arr[s]<arr[m] || (arr[s]==arr[m] && arr[m] > arr[e]))   // left side is sorted, so pivot should be in right
             s=m+1;
            else 
             e=m-1;
        }
        return -1;
    }
}
