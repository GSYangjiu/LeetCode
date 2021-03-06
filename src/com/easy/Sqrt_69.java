package com.easy;

/**
 * Created by Yang on 2017/12/22 0022.
 */
public class Sqrt_69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }
    }
}


//    public int sqrt(int x) {
//        if (x == 0)
//            return 0;
//        int left = 1, right = Integer.MAX_VALUE;
//        while (true) {
//            int mid = left + (right - left)/2;
//            if (mid > x/mid) {
//                right = mid - 1;
//            } else {
//                if (mid + 1 > x/(mid + 1))
//                    return mid;
//                left = mid + 1;
//            }
//        }
//    }