package com.easy;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Yang on 2017/8/6.
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[m]=nums[i];
                m++;
            }
        }
        return m;
    }
}
