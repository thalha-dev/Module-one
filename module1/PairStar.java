import java.util.*;
import java.lang.*;
import java.io.*;

public class PairStar {
    public static String pairStar(String s) {

        if (s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        }
        return s.charAt(0) + pairStar(s.substring(1));
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(pairStar(s));
    }
}
