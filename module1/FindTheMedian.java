import java.util.*;
import java.lang.*;
import java.io.*;

public class FindTheMedian {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        if (n % 2 == 1) {
            System.out.println(a[n / 2]);
        }

        // else {
        //     System.out.println(a[n / 2 - 1] + " " + a[n / 2]);
        // }

    }

}
