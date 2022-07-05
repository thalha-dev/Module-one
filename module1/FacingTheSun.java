import java.util.*;
import java.lang.*;
import java.io.*;

public class FacingTheSun
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];


        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }

        int count = 1;
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }

        System.out.println(count);
        
    }
}

