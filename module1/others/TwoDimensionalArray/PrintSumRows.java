import java.util.*;
import java.lang.*;
import java.io.*;

public class PrintSumRows {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < m; j++) {
                total += arr[i][j];
            }
            System.out.println(total);
        }

    }
}
