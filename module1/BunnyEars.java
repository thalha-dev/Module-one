import java.util.*;
import java.lang.*;
import java.io.*;

public class BunnyEars {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int bunnies = sc.nextInt();
        System.out.println(bunnyEars(bunnies));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }
}
