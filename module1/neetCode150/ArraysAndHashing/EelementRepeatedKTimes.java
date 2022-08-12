import java.io.*;
import java.util.*;

public class EelementRepeatedKTimes {
  public static void main(String[] args) throws java.lang.Exception {
    int[] nums = {1, 1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 8, 8, 9};
    int k = 2;
    System.out.println(Arrays.toString(elementRepeatedKTimes(nums, k)));
  }

  public static int[] elementRepeatedKTimes(int[] nums, int k) {

    Arrays.sort(nums);

    int counter = 0;
    int size = 0;

    int tempElement = nums[0];

    if (k == 1) {
      size = 1;
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] == tempElement) {
          continue;
        } else {
          tempElement = nums[i];
          size++;
        }
      }

      tempElement = nums[0];

      int[] arr = new int[size];
      arr[0] = nums[0];
      int j = 1;

      for (int i = 1; i < nums.length; i++) {
        if (nums[i] == tempElement) {
          continue;
        } else {
          tempElement = nums[i];
          arr[j] = nums[i];
          j++;
        }
      }

      return arr;
    } else {

      counter = 1;

      for (int i = 1; i < nums.length; i++) {
        if (nums[i] == tempElement) {
          counter++;
          if (counter >= k) {
            if (counter > k) {
              continue;
            }
            size++;
          }
        } else {
          tempElement = nums[i];
          counter = 1;
        }
      }

      tempElement = nums[0];
      counter = 1;
      int[] arr = new int[size];
      int j = 0;

      for (int i = 1; i < nums.length; i++) {
        if (nums[i] == tempElement) {
          counter++;
          if (counter >= k) {
            if (counter > k) {
              continue;
            }
            arr[j] = nums[i];
            j++;
          }
        } else {
          tempElement = nums[i];
          counter = 1;
        }
      }
      return arr;
    }
  }
}
