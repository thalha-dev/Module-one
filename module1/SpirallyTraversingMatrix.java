import java.util.*;
import java.lang.*;
import java.io.*;

public class SpirallyTraversingMatrix
{
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner s=new Scanner(System.in);
      int m=s.nextInt();
      int n=s.nextInt();
      int[][] a=new int[m][n];

      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              a[i][j]=s.nextInt();
          }
      }
      int l=0,k=0;

      while(k<m && l<n){
          //1st row 
          for (int i = l; i < n; ++i) {
              System.out.print(a[k][i] + " ");
          }
          k++;

          // last column
          for (int i = k; i < m; ++i) {
              System.out.print(a[i][n - 1] + " ");
          }
          n--;

          // last row opp
          if(k<m){
            for (int i = n - 1; i >= l; --i) {
              System.out.print(a[m - 1][i] + " ");
            }
            m--;
          }
          // 1st col opp
          if (l < n){ 
            for (int i = m - 1; i >= k; --i) {
                System.out.print(a[i][l] + " ");
            }
            l++;
            }
        }
    }
}
