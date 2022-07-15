import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstAndLastPosition {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;
        int temp1 = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == val) {
                temp1 = mid;
                end = mid - 1;
            } else if (a[mid] > val) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // 1st occurence not found
        if (temp1 == -1) {
            System.out.println("-1 -1");
            return;
        }

        start = 0;
        end = n - 1;
        int temp2 = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == val) {
                temp2 = mid;
                start = mid + 1;
            } else if (a[mid] < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(temp1 + " " + temp2);
    }
}
