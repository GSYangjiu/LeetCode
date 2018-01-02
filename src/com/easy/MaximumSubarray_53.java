package com.easy;

/**
 * Created by Yang on 2017/11/23 0023.
 */

//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//        For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//        the contiguous subarray [4,-1,2,1] has the largest sum = 6.

public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxArr = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            max = Math.max(nums[i],max+nums[i]);
            maxArr = Math.max(max,maxArr);
        }
        return maxArr;
    }
}
