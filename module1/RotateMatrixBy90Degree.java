import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateMatrixBy90Degree
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] originalArray = new int[n][m];
        int[][] rotatedArray = new int[m][n];

        for(int i = 0; i < originalArray.length ; i++){
            for(int j = 0 ; j < originalArray[i].length ; j++){
                originalArray[i][j] = s.nextInt();
            }
        }

        
        int innerJ = n-1;
        for(int i = 0; i < originalArray.length ; i++){
            int innerI = 0;
            for(int j = 0 ; j < originalArray[i].length ; j++){
                rotatedArray[innerI][innerJ] = originalArray[i][j];
                innerI++;
            }
            innerJ--;
        }

        for(int i = 0; i < rotatedArray.length ; i++){
            for(int j = 0 ; j < rotatedArray[i].length ; j++){
                System.out.print(rotatedArray[i][j]+" ");
            }
            System.out.println();
        }


        for(int i = 0; i < originalArray.length ; i++){
                System.out.println(Arrays.toString(originalArray[i]));
        }

        System.out.println("");
        for(int i = 0; i < rotatedArray.length ; i++){
                System.out.println(Arrays.toString(rotatedArray[i]));
        }
        
    }
}




