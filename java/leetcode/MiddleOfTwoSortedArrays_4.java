package leetcode;

public class MiddleOfTwoSortedArrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
           int length = nums2.length;
           int middle = length / 2;
           if (length % 2 == 0) {
               return (nums2[middle] + nums2[middle - 1]) / 2.0;
           } else {
               return nums2[middle];
           }
       }
       if (nums2 == null || nums2.length == 0) {
           int length = nums1.length;
           int middle = length / 2;
           if (length % 2 == 0) {
               return (nums1[middle] + nums1[middle - 1]) / 2.0;
           } else {
               return nums1[middle];
           }
       }

       int l1 = nums1.length;
       int l2 = nums2.length;
       int total = l1 + l2;
       int middle = total / 2;
       int currentIndex = 0;

       int i1 = 0;
       int i2 = 0;
       int last = 0;
       int current = 0;
       while (currentIndex <= middle) {
           currentIndex++;
           last = current;
           if (i2 == l2) {
               current = nums1[i1];
               i1++;
               continue;
           }
           if (i1 == l1) {
               current = nums2[i2];
               i2++;
               continue;
           }
           if (nums1[i1] <= nums2[i2]) {
               current = nums1[i1];
               i1++;
           } else {
               current = nums2[i2];
               i2++;
           }

       }
       if (total % 2 == 0) {
           return (last + current) / 2.0;
       } else {
           return current;
       }
   }

}