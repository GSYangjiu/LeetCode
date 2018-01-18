package com.easy;

/**
 * Created by Yang on 2018/1/18 0018.
 */


/*
*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
The number of elements initialized in nums1 and nums2 are m and n respectively.
*/
public class MergeSortedArray_88 {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            //A[k--] = A[i] > B[j] ? A[i--] : B[j--];
            if (A[i] > B[j]) {
                A[k] = A[i];
                i--;
            } else {
                A[k] = B[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
}
