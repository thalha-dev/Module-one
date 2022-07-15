import java.util.*;
import java.lang.*;
import java.io.*;

public class Countabc {
    public static int countabc(String s, int ind) {
        if (ind >= s.length() - 2) {
            return 0;
        }

        if ("abc".equals(s.substring(ind, ind + 3)) || "aba".equals(s.substring(ind, ind + 3))) {
            return 1 + countabc(s, ind + 1);
        }

        return countabc(s, ind + 1);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countabc(s, 0));
    }
}
