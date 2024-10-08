// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count(nums[i]))      //if true count the element with even digits
             c++;
        }
        return c;
    }
    static boolean count(int n)      //to count number of digits of every element
    {
        int k=0;
        while(n>0)
        {
            k++;      //counts number of digits
            n/=10;
        }
        if(k%2==0)      //if even number of digits returns true to the findNumbers function
         return true;
        return false;
    }
}