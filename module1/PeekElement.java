import java.util.*;
import java.lang.*;
import java.io.*;

public class PeekElement {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        if (n == 1) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[0] > arr[1]) {
                System.out.println(i);
                return;
            } else if (i == arr.length - 1 && arr[n - 1] > arr[n - 2]) {
                System.out.println(i);
                return;
            } else if (i != 0 && i != arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
