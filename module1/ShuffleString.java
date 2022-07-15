import java.util.*;
import java.lang.*;
import java.io.*;

public class ShuffleString {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[n];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = sc.nextInt();
        }

        char[] crr = new char[n];
        for (int i = 0; i < n; i++) {
            int targetIndex = arr[i];
            char c = s.charAt(i);
            crr[targetIndex] = c;
        }

        String ret = new String(crr);
        System.out.println(ret);

    }
}
