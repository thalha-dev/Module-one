import java.io.*;
import java.util.*;

public class Hashset {

  public static void main(String[] args) throws java.lang.Exception {

    HashSet<String> s = new HashSet<String>();

    s.add("newyork");
    s.add("chennai");
    s.add("mumbai");
    s.add("thirichi");
    s.add("newyork");

    System.out.println(s);
    s.clear();
    System.out.println(s);
  }
}
