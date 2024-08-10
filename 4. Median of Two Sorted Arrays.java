class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length, n2=nums2.length;
        if(n1>n2)
         return findMedianSortedArrays(nums2, nums1);
        int low=0,h=n1;     //l is the starting index for the binary search on nums1 and h is the ending index
        int left=(n1+n2+1)/2;   //left calculates the total number of elements that should be in the left half of the combined sorted array
        while(low<=h)
        {
            int m1=(low+h)/2;   //It represents the number of elements from nums1 that are included in the left half of the combined sorted array.
            int m2=left-m1;
            int l1=Integer.MIN_VALUE;   //These variables store the maximum values of the left halves of nums1 and nums2, respectively.
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;   //These variables store the minimum values of the left halves of nums1 and nums2, respectively.
            int r2=Integer.MAX_VALUE;
            if(m1>0)
             l1=nums1[m1-1];
            if(m2>0)
             l2=nums2[m2-1];
            if(m1<n1)
             r1=nums1[m1];
            if(m2<n2)
             r2=nums2[m2];
            if(l1<=r2 && l2<=r1)
            {
                if((n1+n2)%2==1)
                 return Math.max(l1,l2);
                else
                 return ((double)(Math.max(l1,l2)+Math.min(r1,r2)))/2.0;
            }
            else if(l1>r2)  //It means we have too many elements from nums1 in the left half, so we move the search range to the left
             h=m1-1;
            else
             low=m1+1;
        }
        return 0;
    }
}