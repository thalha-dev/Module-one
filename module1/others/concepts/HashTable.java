import java.io.*;
import java.util.*;

public class HashTable {

  public static void main(String[] args) throws java.lang.Exception {

    Hashtable<Integer, String> ht = new Hashtable<>();

    ht.put(1, "nvim");
    ht.put(2, "vim");
    ht.put(3, "gedit");
    ht.put(4, "emacs");
    ht.put(5, "nano");
    System.out.println(ht);
    System.out.println(ht.size());
    var n = ht.clone();
    System.out.println(n);
    System.out.println(ht == n);
    String s = ht.toString();
    System.out.println(s);
    ht.remove(3);
    System.out.println(ht);
    System.out.println(ht.size());
    ht.clear();
    System.out.println(ht);
  }
}
