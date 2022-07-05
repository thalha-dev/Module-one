import java.util.*;
import java.lang.*;
import java.io.*;

public class Autori
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ret = "";
        ret+=s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-'){
                ret+=s.charAt(i+1);
            }
        }
        System.out.println(ret);
    }
}
