import java.io.*;
import java.util.*;

public class ContainsDuplicate {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }

    System.out.println(containsDups(a));
  }

  public static boolean containsDups(int[] a) {
    HashSet<Integer> hset = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      if (hset.contains(a[i])) {
        return true;
      }
      hset.add(a[i]);
    }
    return false;
  }
}
