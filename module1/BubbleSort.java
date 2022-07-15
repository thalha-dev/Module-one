import java.util.*;
import java.lang.*;
import java.io.*;

public class BubbleSort {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        bubbleSort(a);
        System.out.println();
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    flag = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("After passing number " + (i + 1) + ":  " + Arrays.toString(a));
            System.out.println();
            if (flag == true) {
                break;
            }
        }
        return;
    }
}
