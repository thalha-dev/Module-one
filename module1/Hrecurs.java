
import java.util.*;
import java.lang.*;
import java.io.*;

public class Hrecurs {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 1; tt <= t; tt++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Case " + tt + ": " + sum(a, n - 1));
        }
    }

    public static int sum(int[] a, int i) {
        if (i == -1) {
            return 0;
        }

        return a[i] + sum(a, i - 1);
    }
}
