import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionSort1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int temp = a[n - 1];
        int i = n - 2;
        for (; i >= 0; i--) {

            if (a[i] >= temp) {
                a[i + 1] = a[i];
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            } else {
                break;
            }
        }
        a[i + 1] = temp;

        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }

    }

}
