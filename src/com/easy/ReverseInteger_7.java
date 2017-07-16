package com.easy;

/**
 * Created by Marik on 2017/7/16.
 */

//    Reverse digits of an integer.
//    Example1: x = 123, return 321
//    Example2: x = -123, return -321
//
//    click to show spoilers.
//
//    Note:
//    The input is assumed to be a 32-bit signed integer.
//    Your function should return 0 when the reversed integer overflows.
public class ReverseInteger_7 {

public int reverse(int x) {
       int result = 0;
       while (x!=0){
           int y = x%10;
           int newResult = result*10+y;
           if ((newResult-y)/10!=result){
               return 0;
           }
           result = newResult;
           x = x/10;
       }
       return result;
    }
}
