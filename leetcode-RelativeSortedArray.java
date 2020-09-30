/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
*/
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int[] arr1Count = new int[1001];
        for(int i:arr1)
            arr1Count[i]++;
        int idx = 0;
        for(int i:arr2)
        {
           while(arr1Count[i]>0)
           {
               arr1[idx++]=i;
               arr1Count[i]--;
           }
        }
        for(int i=0;i<1001;i++)
        {
            while(arr1Count[i]!=0)
            {
                arr1[idx++]=i;
                arr1Count[i]--;
            }
        }
        return arr1;
    }
}
