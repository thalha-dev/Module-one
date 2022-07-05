import java.util.*;
import java.lang.*;
import java.io.*;

public class TransposeOfMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");

        for(int i = 0; i < n ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");

        for(int i = 0; i <n ; i++){
            for(int j = i+1; j <n ; j++){
                int temp =  arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for(int i = 0; i < n ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");

        for(int i = 0; i <n ; i++){
            for(int j = 0; j <n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

