package com.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yang on 2017/7/23.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
    /*   if (nums.length==0)return 0;
       int j = 0;
       for (int i=0;i<nums.length;i++){
           if(nums[i]!=nums[i-1]) {
               j++;
           }
       }
       return ++j;
    }*/
        if (nums.length==0)return 0;
        int j = 0;
        for(int i=1;i<nums.length;i++){
            String newData = Arrays.copyOfRange(nums, 0, i-1).toString();
            if(newData.indexOf(nums[i])==0){
                j++;
            }
        }
        return j;
    }

}
