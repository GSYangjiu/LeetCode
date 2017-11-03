package com.easy;

/**
 * Created by Yang on 2017/11/3 0003.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0, hight = nums.length - 1;
        while (low < hight) {
            int mid = (low + hight) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
