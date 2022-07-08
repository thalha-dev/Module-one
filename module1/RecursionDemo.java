import java.util.*;
import java.lang.*;
import java.io.*;

public class RecursionDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println();
        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
