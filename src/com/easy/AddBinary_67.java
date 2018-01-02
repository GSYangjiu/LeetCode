package com.easy;

/**
 * Created by Yang on 2017/11/24 0024.
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        int x = Integer.parseInt(a,2);
        int y = Integer.parseInt(b,2);
        return Integer.toBinaryString(x+y);
    }
}
