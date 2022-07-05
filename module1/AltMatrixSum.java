import java.util.*;
import java.lang.*;
import java.io.*;

public class AltMatrixSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int black = 0;
        int white = 0;

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = s.nextInt();

                if((i+j) % 2 == 0){
                    black += mat[i][j];
                }
                else{
                    white += mat[i][j];
                }
            }
        }
        System.out.println(black);
        System.out.println(white);
    }
}
