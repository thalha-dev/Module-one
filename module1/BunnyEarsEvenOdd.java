import java.util.*;
import java.lang.*;
import java.io.*;

public class BunnyEarsEvenOdd {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int bunnies = sc.nextInt();
        System.out.println(bunnyEars(bunnies));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {

            return 3 + bunnyEars(bunnies - 1);
        }
        return 2 + bunnyEars(bunnies - 1);
    }
}
