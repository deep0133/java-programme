package AllPrograms.AllInOne.ARRAYS;

import java.util.*;

import java.util.ArrayList;

public class DUBLICATEvalues {

  public static void main(String[] args) {

    int a[] = {1, 2, 3, 4};

    int n = a.length;

    int k = 0;

    ArrayList<Integer> al = new ArrayList();

    Arrays.sort(a);
    boolean m[] = new boolean[n];

    for (int i = 0; i < n - 1; i++) {
      if (a[i] == a[i + 1]) {
        k++;
        m[i + 1] = true;
      }
    }
    for (int i = 0; i < n - 1; i++) {
      if (a[i] == a[i + 1] && !m[i]) {

        al.add(a[i]);
      }
    }
    if (al.isEmpty()) {
      al.add(-1);
    }

    System.out.print(al);
  }
}
