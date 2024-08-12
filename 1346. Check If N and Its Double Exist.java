class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]==2*arr[j])
                 return true;
            }
        }
        return false;
    }
}
/*
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int t=arr[i]*2;
            int s=0,e=arr.length-1;
            while(s<=e)
            {
                int m=s+(e-s)/2;
                if(arr[m]==t && m!=i)
                 return true;
                if(arr[m]<t)
                 s=m+1;
                else
                 e=m-1;
            }
        }
        return false;
    }
}
 */