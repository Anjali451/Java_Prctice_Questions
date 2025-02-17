//Source Code ==> https://leetcode.com/problems/merge-sorted-array/

package array;

public class Merge_Sorted_Array {
    static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = nums1.length - 1;
        int p3 = n-1;

        while(p1>=0 && p3>=0){
            if(nums1[p1] > nums2[p3]){
                nums1[p2] = nums2[p2];
                p1--;
            }else {
                nums1[p2] = nums2[p3];
                p3--;
            }

            p2--;
        }

        while (p3 >=0){
            nums1[p2] = nums2[p3];
            p2--;
            p3--;
        }
    }
}
