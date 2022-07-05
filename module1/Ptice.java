import java.util.*;
import java.lang.*;
import java.io.*;

public class Ptice {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String Adrian = "ABC";
        String Bruno = "BABC";
        String Goran = "CCAABB";

        int a_score = 0;
        int b_score = 0;
        int g_score = 0;

        int n = sc.nextInt();

        while (Adrian.length() < n) {
            Adrian += "ABC";
        }
        while (Bruno.length() < n) {
            Bruno += "BABC";
        }
        while (Goran.length() < n) {
            Goran += "CCAABB";
        }
        String ans = sc.next();

        for (int i = 0; i < n; i++) {
            if (ans.charAt(i) == Adrian.charAt(i)) {

                a_score++;
            }
            if (ans.charAt(i) == Bruno.charAt(i)) {

                b_score++;
            }
            if (ans.charAt(i) == Goran.charAt(i)) {

                g_score++;
            }
        }

        int max_score = Math.max(a_score, Math.max(b_score, g_score));

        System.out.println(max_score);
        if (a_score == max_score) {
            System.out.println("Adrian");
        }
        if (b_score == max_score) {
            System.out.println("Bruno");
        }
        if (g_score == max_score) {
            System.out.println("Goran");
        }
    }

}
