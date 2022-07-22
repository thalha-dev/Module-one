import java.util.*;
import java.lang.*;
import java.io.*;

public class Array11 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int index = 0;
        System.out.println(array11(a, index));

    }

    public static int array11(int[] a, int index) {
        if (index == a.length) {
            return 0;
        }

        if (a[index] == 11) {
            return 1 + array11(a, index + 1);
        }
        return array11(a, index + 1);
    }
}
