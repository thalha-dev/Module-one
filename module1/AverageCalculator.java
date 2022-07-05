import java.util.*;
import java.lang.*;
import java.io.*;

public class AverageCalculator
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(sum/size);

	}
}

