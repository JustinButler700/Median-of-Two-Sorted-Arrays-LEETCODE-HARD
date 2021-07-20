class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
     // 1. concatenate the two given arrays
        int[] arr = IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
    // 2. Re-sort the array
        Arrays.sort(arr);
    //3. Return the median of the data set
        if(arr.length%2 == 0) // an even length array will return a non whole number
        {
            return((arr[arr.length/2]+arr[(arr.length/2)-1])/2.0);
        }
        else // odd
        {
            return(arr[arr.length/2]);
        }
    }
}
