import java.util.*;
import java.lang.*;
import java.io.*;

public class ClimbStairs {
    public static void main(String[] args) throws java.lang.Exception {
        int i = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println();
        int ans = climbStairs(i, n);
        System.out.println(ans);
    }

    public static int climbStairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }

        return climbStairs(i + 1, n) + climbStairs(i + 2, n);
    }
}
