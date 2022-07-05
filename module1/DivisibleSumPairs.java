import java.util.*;
import java.lang.*;
import java.io.*;

public class DivisibleSumPairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // coutnter
        int counter = 0;

        // check
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(i < j){
                    if(j == i){
                        continue;
                    }else{
                        if((arr[i] + arr[j]) % target == 0){
                            counter++;
                        }
                    }
                }
            }
        }
        if(counter > 0){
            System.out.println(counter);
        }
    }
}
