import java.util.*;
import java.lang.*;
import java.io.*;

public class SubarraySumDivisibleByK
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0 ; i < size ; i++){
            int sum = 0;
            for(int j = i ; j < size ; j++){
                sum = sum + arr[j];
                if(sum%target == 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

