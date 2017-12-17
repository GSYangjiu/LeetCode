package com.easy;

/**
 * Created by Marik on 2017/11/24 0024.
 */

//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//        If the last word does not exist, return 0.
public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
