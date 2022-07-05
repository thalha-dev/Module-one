import java.util.*;
import java.lang.*;
import java.io.*;

public class BubbleSortDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
            System.out.println("After passing number "+ (i+1) + ":  "+ Arrays.toString(arr));
            System.out.println();
            if(flag==true){
                break;
            }
        }
        return;
    }
}
