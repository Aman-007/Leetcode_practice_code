
/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order. The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n
elements are set to 0 and should be ignored. nums2 has a length of n.*/


    class Solution {
        public void merge(int[] arr1, int m, int[] arr2, int n) {
            int p=m-1, q=n-1, i=m+n-1;

            while(q>=0){
                if(p>=0 && arr1[p]>arr2[q])
                    arr1[i--]=arr1[p--];
                else
                    arr1[i--]=arr2[q--];
            }


        }



}
