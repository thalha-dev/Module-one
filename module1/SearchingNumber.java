import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size+1];
        arr[0] = 0;
        for(int i = 1 ; i <= size ; i++){
            arr[i] = sc.nextInt();
        }

        int output = -1;

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == target){
                output = i;
                break;
            }
        }

        System.out.println(output);
	}
}


