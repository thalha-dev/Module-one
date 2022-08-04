import java.util.Scanner;

public class SumOfNaturalNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      long num = sc.nextInt();
      long sum = 0;
      for(int i = 1; i<= num ; i++){
        sum = sum+i;
        
      }
      System.out.println(sum);
   
	}
}


