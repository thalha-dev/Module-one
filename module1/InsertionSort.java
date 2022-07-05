import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionSort {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(arr) + "  BEFORE");
        System.out.println();
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
            System.out.println("After pass number " + (i) + " " + Arrays.toString(arr));
        }
    }

}
