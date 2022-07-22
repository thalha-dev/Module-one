import java.util.*;
import java.lang.*;
import java.io.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[n1 + n2];

        // 1
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;

            }
        }

        while (i < n1) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        for (i = 0; i < n1 + n2; i++) {

            System.out.print(arr3[i] + " ");
        }
    }

}
