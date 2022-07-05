import java.util.*;
import java.lang.*;
import java.io.*;

public class Hey
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int counte = 0;
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i)=='e'){
                counte++;
            }
        }

        String ret ="h";
        for(int i = 0; i < 2*counte ; i++){
                ret+="e";
        }
        ret+="y";
        System.out.println(ret);

    }
}




