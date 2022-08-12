import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        selectionSort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("minIndex at enterance : "+ minIndex + " which is == i :" + i);
            for (int j = i + 1; j < n; j++) {
                System.out.println("j value : " + j);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("minIndex changed to : "+ minIndex);
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println("After pass number " + (i + 1) + ":  " + Arrays.toString(arr));
        }
    }
}
