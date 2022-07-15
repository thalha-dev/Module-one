import java.util.*;
import java.lang.*;
import java.io.*;

public class count7 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(count7(n));
    }

    public static int count7(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }
}
