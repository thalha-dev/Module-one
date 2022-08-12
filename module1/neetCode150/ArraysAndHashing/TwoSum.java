import java.io.*;
import java.util.*;

public class TwoSum {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int target = s.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }

    System.out.println(Arrays.toString(twoSum(a, target)));
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> prevMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int diff = target - num;

      if (prevMap.containsKey(nums[i])) {
        return new int[] {prevMap.get(num), i};
      }

      prevMap.put(target - num, i);
    }

    return new int[] {};
  }
}
