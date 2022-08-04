import java.io.*;
import java.util.*;

public class Hashmap {

  public static void main(String[] args) throws java.lang.Exception {

    HashMap<String, Integer> hmap1 = new HashMap<>();

    hmap1.put("Thalha", 500000);
    hmap1.put("Jhon", 300000);
    hmap1.put("Mike", 600000);
    hmap1.put("luke", 200000);
    hmap1.put("Derek", 100000);

    System.out.println(hmap1);

    System.out.println(hmap1.keySet());

    Iterator<String> itr = hmap1.keySet().iterator();

    while (itr.hasNext()) {
      String key = itr.next();
      System.out.println(key);
    }

    System.out.println(hmap1.containsKey("Thalha"));
  }
}
