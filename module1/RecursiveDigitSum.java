import java.util.*;
import java.lang.*;
import java.io.*;

public class RecursiveDigitSum {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();

        // repeat k times
        String s = new String("");
        for (int i = 0; i < k; i++) {
            s += n;
        }
        System.out.println(superDigit(s));
    }

    public static String superDigit(String n) {

        if (n.length() == 1) {
            return n;
        }
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            // sum += Integer.valueOf(String.valueOf(n.charAt(i)));
            sum += n.charAt(i) - '0';
        }

        n = Long.toString(sum);
        return superDigit(n);

    }
}
