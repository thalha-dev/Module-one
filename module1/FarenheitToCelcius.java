import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        if(f >= -1000 && f <= 1000){
            int c = ( (f - 32)*5 )/9;
            // int part2 = part1/9;
            System.out.println(c);
        }
	}
}
