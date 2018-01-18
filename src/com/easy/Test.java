package com.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marik on 2017/7/16.
 */
public class Test {
    public static void main(String[] args) {
        MergeSortedArray_88 mergeSortedArray_88 = new MergeSortedArray_88();
        int[] a = {2, 3, 5, 9, 0, 0, 0};
        int[] b = {1, 4, 8, 0, 0, 0};

        mergeSortedArray_88.merge(a, 4, b, 3);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
