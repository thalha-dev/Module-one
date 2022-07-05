import java.util.*;
import java.lang.*;
import java.io.*;

public class SortedInsertPosition
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int[] arr = new int[size];

        for(int i = 0 ;i < size ; i++){

            arr[i] = s.nextInt();

        }

        int target = s.nextInt();

        for(int i = 0 ; i < arr.length ; i++){

            if( i == arr.length-1 && arr[i] != target ){
                System.out.println(i+1);
                break;
            }
            else if(arr[i] == target){
                System.out.println(i);
                break;

            }else if(arr[i] > target){
                System.out.println(i);
                break;

            }
        }

	}
}
