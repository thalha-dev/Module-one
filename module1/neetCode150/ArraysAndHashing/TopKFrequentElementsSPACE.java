import java.io.*;
import java.util.*;

public class TopKFrequentElementsSPACE {
  public static void main(String[] args) throws java.lang.Exception {
    int[] nums = {1, 1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 8, 8, 9};
    int k = 2;
    System.out.println(Arrays.toString(topKFrequent(nums, k)));
  }

  public static int[] topKFrequent(int[] nums, int k) {
    int[] arr = new int[k];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
    PriorityQueue<Map.Entry<Integer, Integer>> pq =
        new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
      pq.add(it);
      if (pq.size() > k) pq.poll();
    }
    int i = k;
    while (!pq.isEmpty()) {
      arr[--i] = pq.poll().getKey();
    }
    return arr;
  }
}
