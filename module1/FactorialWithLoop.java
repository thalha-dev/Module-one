import java.util.*;
import java.lang.*;
import java.io.*;

public class FactorialWithLoop
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        long factorial = 1;
        if(num >= 0 && num <= 20){
            while(i <= num){
                factorial *= i;
                i++;
            }
            System.out.println(factorial);
        }
	}
}


