class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0,m=matrix.length,n=matrix[0].length,e=(m*n)-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int r=mid/n;
            int c=mid%n;
            if(matrix[r][c]>target)
             e=mid-1;
            else if(matrix[r][c]<target)
             s=mid+1;
            else
             return true;
        }
        return false;
    }
}