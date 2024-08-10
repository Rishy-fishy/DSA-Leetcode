/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

/*
while(s<=e)
        {
            int m=s+(e-s)/2;
            if(MountainArray.get(m)<MountainArray.get(m+1))
             s=m+1;
            else if(MountainArray.get(m)>MountainArray.get(m+1))
             e=m-1;
            else 
             return m;
        }
        return -1;
*/
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int p=findpeak(mountainArr);            //finds the pivot element
        int a=asc(mountainArr, 0,p,target);     //searches in the left side of the array which is in ascending order
        if(a!=-1)       //if found in ascending part no need to move to descending part of the array
         return a;
        int d=dsc(mountainArr, p, mountainArr.length()-1,target);      //searches in the right side of the array which is in descending order
        return d;
    }
    public int findpeak(MountainArray a)
    {
        int s=0;int e=a.length()-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(a.get(m)<a.get(m+1))
             s=m+1;
            else if(a.get(m)>a.get(m+1))
             e=m-1;
        }
        return s;
    }
    public int asc(MountainArray a,int s, int e,int t)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(a.get(m)<t)
             s=m+1;
            else if(a.get(m)>t)
             e=m-1;
            else
             return m;
        }
        return -1;
    }
    public int dsc(MountainArray a,int s, int e,int t)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(a.get(m)>t)
             s=m+1;
            else if(a.get(m)<t)
             e=m-1;
            else
             return m;
        }
        return -1;
    }
}