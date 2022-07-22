import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;

    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));

    }
}
