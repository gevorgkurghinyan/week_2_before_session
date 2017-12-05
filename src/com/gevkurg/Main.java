package com.gevkurg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //System.out.println(WindowString.minWindow("ADOBECODEBANC", "ABC"));

        int[] array = new int[]{9, -8, -10, -7, 7, -8, 2, -7, 4, 7, 0, -3, -4, -5, -1, -4, 5, 8, 1, 9, -2, 5, 10, -5, -7, -1, -6, 4, 1, -5, 3, 8, -4, -10, -9, -3, 10, 0, 7, 9, -8, 10, -9, 7, 8, 0, 6, -6, -7, 6, -4, 2, 0, 10, 1, -2, 5, -2};
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : array)
            list.add(n);

        System.out.println(FourSum.fourSum(list, 0));
    }
}
