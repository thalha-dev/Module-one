import java.io.*;
import java.util.*;

public class SetMatrixZeros {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    int col0 = 1, rows = matrix.length, cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      if (matrix[i][0] == 0) {
        col0 = 0;
      }
      for (int j = 1; j < cols; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = matrix[0][j] = 0;
        }
      }
    }

    for (int i = 0; i < rows; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }

    System.out.println();
    System.out.println();

    for (int i = rows - 1; i >= 0; i--) {
      for (int j = cols - 1; j >= 0; j--) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
      if (col0 == 0) matrix[i][0] = 0;
    }

    for (int i = 0; i < rows; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }

    System.out.println();
    System.out.println();
  }
}
