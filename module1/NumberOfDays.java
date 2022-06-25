import java.util.*;
import java.lang.*;
import java.io.*;

public class NumberOfDays{

    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 31: 1,3,5,7,8,10,12
        if(n == 1 || n == 3 ||n == 5 ||n == 7 ||n == 8 ||n == 10 ||n == 12 ){
            System.out.println(31);
        }
        else if(n == 2){
            System.out.println(28);
        }else {
            System.out.println(30);
        }
    }
}


