package com.easy;

/**
 * Created by Yang on 2018/1/2 0002.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0){
            a = (b += a) - a;
        }
        return a;
    }
}
