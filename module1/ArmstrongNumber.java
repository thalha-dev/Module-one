import java.util.*;
import java.lang.*;
import java.io.*;

public class ArmstrongNumber
{
    public static boolean checkForArmstrong(int num){

        int originalNumber = num;
        int armstrongNumber = 0;

        while(num != 0){
            int digit = num % 10;

            armstrongNumber = armstrongNumber + ( digit * digit * digit );

            num /= 10;
            
        }
        if(originalNumber == armstrongNumber){
            return true;
        }
        else{
            return false;
        }

    }
	public static void main (String[] args) throws java.lang.Exception
	{

        for(int i = 1 ; i <= 500; i++ ){

            boolean check = checkForArmstrong(i);

            if(check){
                System.out.println(i);
            }
        }

	}
}
