import java.util.*;
import java.lang.*;
import java.io.*;

public class HouseRobber {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int end = s.nextInt();
        int[] nums = new int[end];
        for (int i = 0; i < end; i++) {
            nums[i] = s.nextInt();
        }
        f(nums, nums.length - 1);
    }

    public static int f(int[] nums, int end) {
        if (end < 0) {
            return 0;
        }

        int opt1 = f(nums, end - 1);
        int opt2 = nums[end] + f(nums, end - 2);
        return Math.max(opt1, opt2);
    }
}
