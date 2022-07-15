import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateMatrixBy90Degree2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("");

        // LOGIC--------------------------------------------

        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j < n - i - 1; j++) {

                int temp = a[i][j];
                a[i][j] = a[n - 1 - j][i];
                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
                a[j][n - 1 - i] = temp;

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

    }
}
