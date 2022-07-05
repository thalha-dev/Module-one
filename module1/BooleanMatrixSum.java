import java.util.*;
import java.lang.*;
import java.io.*;

public class BooleanMatrixSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];

        int sum = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 1){
                    sum += 1;
                    break;
                }
            }
        }

        // System.out.println("");
        // System.out.println("-----------------------------------BEFORE");
        // System.out.println("");
        // for(int i = 0; i < matrix.length ; i++){
        //     System.out.println(Arrays.toString(matrix[i]));
        // }

        int[] oneIndex = new int[sum];

        int k = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 1){
                    oneIndex[k] = i;
                    k++;
                    break;
                }
            }
        }

        // System.out.println("");
        // System.out.println("-----------------------------------INDEXES");
        // System.out.println(Arrays.toString(oneIndex));

        for(int i = 0 ; i < oneIndex.length ; i++){
            for(int j = 0 ; j < m ; j++){
                int temp = oneIndex[i];
                matrix[temp][j] = 1;
            }
        }
        

        // System.out.println("");
        // System.out.println("-----------------------------------AFTER");
        // System.out.println("");
        // for(int i = 0; i < matrix.length ; i++){
        //     System.out.println(Arrays.toString(matrix[i]));
        // }

        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
