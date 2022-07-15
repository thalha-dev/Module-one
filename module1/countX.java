import java.util.*;
import java.lang.*;
import java.io.*;

public class countX {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        System.out.println(countString(n));
    }

    public static int countString(String str) {
        return f(str, 0);

    }

    public static int f(String s, int start) {
        if (start == s.length()) {
            return 0;
        }
        if (s.charAt(start) == 'x') {
            return 1 + f(s, start + 1);

        } else {
            return f(s, start + 1);
        }
    }
}
