import java.io.*;
import java.util.*;

public class ValidAnagram {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    System.out.println(validAnagram(s, t));
  }

  public static boolean validAnagram(String s, String t) {
    int[] store = new int[26];

    for (int i = 0; i < s.length(); i++) {
      store[s.charAt(i) - 'a']++;
      store[t.charAt(i) - 'a']--;
    }

    System.out.println(Arrays.toString(store));

    for (int n : store) if (n != 0) return false;

    return true;
  }
}
