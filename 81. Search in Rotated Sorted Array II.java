class Solution {
    public static boolean search(int[] nums, int target) 
    {
        int p=find(nums);
        if(p==-1)       //if there is no pivot element then the array is not rotated and we can search the number in the whole array
         return Search(nums, target, 0, nums.length-1);
        else if(nums[p]==target)
         return true;
        else if (target>=nums[0])       //if the target is greater than the starting element then search the number from index 0 to index pivot
         return Search(nums, target, 0, p-1);
        return Search(nums, target, p+1, nums.length-1);        //else the number lies in the second half
    }
    public static boolean Search(int[] a, int t, int s, int e)      //for searching the number
    {
        while(s<= e) 
        {
            int m=s+(e-s)/2;
            if (t<a[m]) 
             e=m-1;
            else if(t>a[m]) 
             s=m+1;
            else 
             return true;
        }
        return false;
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
                if(e>s && arr[e]<arr[e-1])  // check whether end is pivot
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