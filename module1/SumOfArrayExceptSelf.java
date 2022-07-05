import java.util.*;
import java.lang.*;
import java.io.*;

public class SumOfArrayExceptSelf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum= sum + arr[i];
        }

        for(int i=0; i <n ; i++){
          System.out.print(sum-arr[i]+" ");
        }
      

        
	}
}
