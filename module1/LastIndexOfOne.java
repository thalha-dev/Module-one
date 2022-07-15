import java.util.*;
import java.lang.*;
import java.io.*;

public class LastIndexOfOne {
    public static int index_(String s) {
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int final_ind = index_(s);
        System.out.println(final_ind);
    }
}
