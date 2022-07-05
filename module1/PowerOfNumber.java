import java.util.*;
import java.lang.*;
import java.io.*;

public class PowerOfNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();

        int result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println(result);
    }
}



