class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for (int[] arr:grid)        //take every array
        {
            int s=0;
            int e=arr.length-1;
            if(arr[s]>-1 && arr[e]>-1)      //if the row contains any negative number or not
             continue;
            else 
            {
                while(s<e)      //find the first negative number
                {
                    int m=s+(e-s)/2;
                    if(arr[m]<0)
                     e=m;       
                    else
                     s=m+1;
                }
                c+=(arr.length-e);      //after finding the first negative number subtract it with the row length as after it all are negative
            }
        }       
        return c;
    }
}
