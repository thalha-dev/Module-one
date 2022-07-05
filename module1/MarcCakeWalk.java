import java.util.*;
import java.lang.*;
import java.io.*;

public class MarcCakeWalk
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i < size ; i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        long power = 1, ans =0; 
        for(int i = size -1; i>=0; i--){
            ans += power * arr[i];
            power *= 2;
        }
        System.out.println(ans);
	}
}

