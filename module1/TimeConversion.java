import java.util.*;
import java.lang.*;
import java.io.*;

public class TimeConversion {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String hh = s.substring(0, 2);
        String rest = s.substring(2, 8);

        if (Integer.valueOf(hh) == 12) {
            if (s.charAt(8) == 'A') {
                hh = "00";
            }

        } else {
            if (s.charAt(8) == 'P') {
                int h = Integer.valueOf(hh);
                h = h + 12;
                hh = Integer.toString(h);
            }

        }
        System.out.println(hh+rest);
    }

}
