// https://leetcode.com/problems/richest-customer-wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=Integer.MIN_VALUE;
        for(int r=0;r<accounts.length;r++)
        {
            int s=0;
            for(int c=0;c<accounts[r].length;c++)
             s=s+accounts[r][c];        // to calculate the sum
            if(s>m)     //check if it's the maximum sum or not
             m=s;
        }
        return m;
    }
}