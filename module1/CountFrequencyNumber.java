import java.util.*;
import java.lang.*;
import java.io.*;

public class CountFrequencyNumber {
    public static int count(int n, int d) {
        String N = Integer.toString(n);
        String D = Integer.toString(d);
        int c = 0;
        for (int i = 0; i < N.length(); i++) {
            if (D.equals(Character.toString(N.charAt(i)))) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(count(n, d));
    }
}
