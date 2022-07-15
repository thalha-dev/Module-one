import java.util.*;
import java.lang.*;
import java.io.*;

public class CalculateNCR {
    public static long factorial(int n) {
        long prod = 1;
        for (int i = n; i >= 1; i--) {
            prod = prod * i;
        }
        return prod;
    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ncr = (factorial(n)) / (factorial(n - r) * factorial(r));
        System.out.println(ncr);
    }
}
