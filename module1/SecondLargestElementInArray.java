import java.util.*;
import java.lang.*;
import java.io.*;

public class SecondLargestElementInArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[size-2]);
	}
}
