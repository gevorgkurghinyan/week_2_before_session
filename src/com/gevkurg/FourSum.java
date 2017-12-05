package com.gevkurg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class FourSum {
  public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b) {
    if (a == null || a.size() <= 3) {
      return new ArrayList<>();
    }

    a.sort(Comparator.comparingInt(x -> x));

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    int n = a.size();

    for (int i = 0; i < n - 3; i++) {
      if (i > 0 && a.get(i) == a.get(i - 1)) continue;
      if (a.get(i) + a.get(i + 1) + a.get(i + 2) + a.get(i + 3) > b) break;
      if (a.get(i) + a.get(n - 3) + a.get(n - 2) + a.get(n - 1) < b) continue;
      for (int j = i + 1; j < n - 2; j++) {
        if (j > i + 1 && a.get(j) == a.get(j - 1)) continue;
        if (a.get(i) + a.get(j) + a.get(j + 1) + a.get(j + 2) > b) break;
        if (a.get(i) + a.get(j) + a.get(n - 2) + a.get(n - 1) < b) continue;
        int left = j + 1, right = n - 1;
        while (left < right) {
          int sum = a.get(left) + a.get(right) + a.get(i) + a.get(j);
          if (sum < b) left++;
          else if (sum > b) right--;
          else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(a.get(i));
            list.add(a.get(j));
            list.add(a.get(left));
            list.add(a.get(right));
            result.add(list);
            do {
              left++;
            } while (a.get(left) == a.get(left - 1) && left < right);
            do {
              right--;
            } while (a.get(right) == a.get(right + 1) && left < right);
          }
        }
      }
    }

    return result;
  }
}
