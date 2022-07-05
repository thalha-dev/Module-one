import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i=0; i<t; i++){
            int n = s.nextInt();
            int k = s.nextInt();
            int a[] = new int[n];
            
            int ontime=0;

            for(int j=0; j<n; j++){
                a[j] = s.nextInt();

                if(a[j] <= 0){
                    ontime++;
                }
            }
            if(ontime>=k){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
	}
}
